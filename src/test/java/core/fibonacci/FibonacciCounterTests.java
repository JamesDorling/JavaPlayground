package core.fibonacci;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import  static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FibonacciCounterTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    FibonacciCounter testFibCounter = new FibonacciCounter(22);
    @Test
    public void FibCounterTest()
    {
        //The only necessary test. Actually more than necessary, as the only needed values are sort of the first 3.
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 5, 8, 13, 21}, testFibCounter.getSequence().toArray(new Integer[0]));
    }
}
