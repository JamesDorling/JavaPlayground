package core.bubble_sort;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import  static org.junit.jupiter.api.Assertions.assertEquals;
import  static org.junit.jupiter.api.Assertions.assertArrayEquals;
import  static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortIntTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    Integer[] testList = new Integer[]{7, 2, 4, 3, 6, 8, 100, 2, 5, 6};
    BubbleSort sorter = new BubbleSortIntArray(testList);
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
        System.out.println(sorter.getArray());
        Integer[] expected = new Integer[]{2, 2, 3, 4, 5, 6, 6, 7, 8, 100};
        assertArrayEquals(expected, sorter.getArray());
    }
}
