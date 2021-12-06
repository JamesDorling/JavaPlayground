package core.bubble_sort;

import org.junit.jupiter.api.Test;

import  static org.junit.jupiter.api.Assertions.assertEquals;
import  static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortIntTests {
    ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(7, 2, 4, 3, 6, 8, 100, 2, 5, 6));
    BubbleSort sorter = new BubbleSortInt(testList);
    @Test
    public void bubbleSortIterationsTest()
    {
        assertEquals(sorter.getIterations(), 7);
    }

    @Test
    public void bubbleSortTimeTest()
    {
        assertTrue(sorter.getTimeTaken() < 5);
    }

    @Test
    public void bubbleSortSwapsTest()
    {
        assertEquals(sorter.getSwaps(), 18);
    }

    @Test
    public void bubbleSortOrderTest()
    {
        assertEquals("[2, 2, 3, 4, 5, 6, 6, 7, 8, 100]", sorter.getArrayList().toString());
    }
}
