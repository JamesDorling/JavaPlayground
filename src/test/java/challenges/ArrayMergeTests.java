package challenges;

import  static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.*;


public class ArrayMergeTests {
    ArrayMerge merger;

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @BeforeEach
    void setup(TestInfo testInfo) {
        Integer[] list1 = {5, 1, 3, 9, 6, 7, 2}, list2 = {8, 2, 3, 4, 7, 5, 0};
        merger = new ArrayMerge(list1, list2);
    }

    @Test
    @DisplayName("Array Merge Order Test")
    public void orderTests() {
        assertArrayEquals(new Integer[]{5, 1, 3, 9, 6, 7, 2, 8, 2, 3, 4, 7, 5, 0}, merger.getMergedArray());
    }

    @Test
    @DisplayName("Sorted Array Merge Order Test")
    public void sortedOrderTest() {
        assertArrayEquals(new Integer[]{0, 1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9}, merger.getMergedArraySorted());
    }

    @Test
    @DisplayName("Backwards Sorted Array Merge Order Test")
    public void sortedOrderBackwardsTest() {
        assertArrayEquals(new Integer[]{9, 8, 7, 7, 6, 5, 5, 4, 3, 3, 2, 2, 1, 0}, merger.getMergedArraySortedBackwards());
    }

    @Test
    @DisplayName("Dupeless Array Merge Order Test")
    public void orderDupelessTest() {
        assertArrayEquals(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, merger.getMergedArrayDupeless()); //Must be sorted
    }
}
