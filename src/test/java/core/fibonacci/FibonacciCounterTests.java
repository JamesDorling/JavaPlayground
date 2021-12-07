package core.fibonacci;

import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FibonacciCounterTests {
    FibonacciCounter testFibCounter = new FibonacciCounter(22);
    @Test
    public void fibCounterTest()
    {
        //The only necessary test. Actually more than necessary, as the only needed values are sort of the first 3.
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 5, 8, 13, 21}, testFibCounter.getSequence().toArray(new Integer[0]));
    }
}
