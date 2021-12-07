package core.binary_tree;

public class BinaryTree {
    Node root;

    //Two constructors. Either setting a root node or setting it to null.
    BinaryTree(int rootValue)
    {
        root = new Node(rootValue);
    }
    //Constructor two, so that a starting node is not necessary.
    BinaryTree()
    {
        root = null;
    }

    //Recursive node addition. Will loop from node until it finds the perfect spot that is null.
    private static Node addNodeRecursive(Node currentNode, int addedValue)
    {
        //If the current node is a null, then make a new node with the value.
        if(currentNode == null) {
            return new Node(addedValue);
        }

        //If the value to be added is less than the current node's value then make a new node at currentNode.left.
        if(addedValue <= currentNode.value) {
            currentNode.left = addNodeRecursive(currentNode.left, addedValue);
        } //If the value to be added is more than the current node's value then make a new node at currentNode.right.
        else if (addedValue > currentNode.value) {
            currentNode.right = addNodeRecursive(currentNode.right, addedValue);
        }
        //Else return currentNode, as the node already exists.
        return currentNode;
    }

    //Add function, triggers the recursive add function on the root.
    public void add(int value) {
        root = addNodeRecursive(root, value);
    }

    //Add function used but for an array. Make it easier to add nodes if you can do them all at once.
    public void add(int[] valueArray) {
        for(int i = 0; i < valueArray.length; i++)
        {
            //Iterate through the array and add each value.
            this.add(valueArray[i]);
        }
    }
}
