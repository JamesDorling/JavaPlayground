package challenges;

import  static org.junit.jupiter.api.Assertions.assertEquals;
import  static org.junit.jupiter.api.Assertions.assertArrayEquals;
import  static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArrayMergeTests {
    private Integer[] list1 = {5, 1, 3, 9, 6, 7, 2}, list2 = {8, 2, 3, 4, 7, 5, 0};
    private ArrayMerge merger = new ArrayMerge(list1, list2);

    @Test
    public void orderTests()
    {
        assertArrayEquals(new Integer[]{5, 1, 3, 9, 6, 7, 2, 8, 2, 3, 4, 7, 5, 0}, merger.getMergedArray());
        assertArrayEquals(new Integer[]{0, 1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9}, merger.getMergedArraySorted());
        assertArrayEquals(new Integer[]{9, 8, 7, 7, 6, 5, 5, 4, 3, 3, 2, 2, 1, 0}, merger.getMergedArraySortedBackwards());
        assertArrayEquals(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, merger.getMergedArrayDupeless()); //Must be sorted
    }
}
