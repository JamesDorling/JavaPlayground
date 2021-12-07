package core.binary_tree;

import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTests {
    BinaryTree tree1 = new BinaryTree(5);
    BinaryTree tree2 = new BinaryTree();

    @Test
    public void binaryTreeAddTest() {
        tree1.add(2);
        tree1.add(3);
        tree1.add(new int[]{9, 6});
        assertEquals(3, tree1.root.left.right.value);
        assertEquals( 6, tree1.root.right.left.value);
    }

    @Test
    public void binaryTreeSearchTest() {
        tree1.add(new int[]{9, 6});
        //Hard typing in the route it needs to go through to search.
        assertEquals(tree1.root.right.left.value, BinaryTreeSearch.binaryTreeSearch(tree1.root, 6).value);
    }

        //Doesnt have a remove yet. I am going to try and make one.
    @Test
    public void binaryTreeRemoveTest() {

    }
}
