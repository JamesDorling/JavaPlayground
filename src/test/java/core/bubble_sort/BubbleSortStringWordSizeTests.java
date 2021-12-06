package core.bubble_sort;

import org.junit.jupiter.api.Test;

import  static org.junit.jupiter.api.Assertions.assertEquals;
import  static org.junit.jupiter.api.Assertions.assertArrayEquals;
import  static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortStringWordSizeTests {
    String[] testList = new String[]{"Hello,", "I", "am", "coding", "in", "Java"};
    BubbleSort sorter = new BubbleSortStringWordSize(testList);
    @Test
    public void bubbleSortIterationsTest()
    {
        assertEquals(sorter.getIterations(), 3);
    }

    @Test
    public void bubbleSortTimeTest()
    {
        assertTrue(sorter.getTimeTaken() < 5);
    }

    @Test
    public void bubbleSortSwapsTest()
    {
        assertEquals(sorter.getSwaps(), 6);
    }

    @Test
    public void bubbleSortOrderTest()
    {
        String[] expected = new String[]{"I", "am", "in", "Java", "Hello,", "coding"};
        assertArrayEquals(expected, sorter.getArray());
    }
}