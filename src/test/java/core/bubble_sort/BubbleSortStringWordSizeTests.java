package core.bubble_sort;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.w3c.dom.ls.LSOutput;

import  static org.junit.jupiter.api.Assertions.assertEquals;
import  static org.junit.jupiter.api.Assertions.assertArrayEquals;
import  static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortStringWordSizeTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

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