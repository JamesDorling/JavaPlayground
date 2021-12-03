package core;

import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertEquals;
import  static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BinarySearchTests {
    BinarySearch binSearch = new BinarySearch();

    @Test
    public void findTest()
    {
        //Test to not only see if it is correct but can find the top and bottom value
        //I wrote the actual in expected and expected in actual, but its assertEquals so its the same thing
        int[] list1 = {-10, -2, 0, 1, 3, 7, 9, 12, 13, 23, 25};
        assertEquals(binSearch.binarySearch(list1, -10), 0);
        assertEquals(binSearch.binarySearch(list1, -2), 1);
        assertEquals(binSearch.binarySearch(list1, 1), 3);
        assertEquals(binSearch.binarySearch(list1, 9), 6);
        assertEquals(binSearch.binarySearch(list1, 23), 9);
        assertEquals(binSearch.binarySearch(list1, 25), 10);
    }

    @Test
    public void dupeTest()
    {
        //Test to not only see if it is correct but can find the top and bottom value
        int[] list1 = {0, 0, 0, 0, 0, 0, 0};
        assertEquals(binSearch.binarySearch(list1, 0), 0);
    }

    @Test
    public void badInfoTest()
    {
        int[] badList = {8, 2, 1, 6, 3, 6, 7, 2, 3, 1928673};
        assertEquals(-1, binSearch.binarySearch(badList, 8));
        //This one is 5 because it starts on the right one
        assertEquals(5, binSearch.binarySearch(badList, 6));
        assertEquals(-1, binSearch.binarySearch(badList, 3));
        //This should pass because its so high that the search will always jump up.
        assertEquals(9, binSearch.binarySearch(badList, 1928673));
    }
}
