package core.binary_tree;
//Package private.
public class Node {
    //Predefine the stored items, those being the value, the nodes to the left and to the right.
    int value;
    Node left, right;

    //Constructor to initialise the stored values
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
