package challenges;

import core.array_functions.ArraySummer;
import core.fibonacci.FibonacciCounter;
import org.junit.jupiter.api.Test;

import  static org.junit.jupiter.api.Assertions.assertEquals;
import  static org.junit.jupiter.api.Assertions.assertArrayEquals;
import  static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenFibonacciSumTests {
    //4 million for the ProjectEuler question
    FibonacciCounter fibCount = new FibonacciCounter(4000000);
    //order is unecessary as is using the same function to calculate the fibonacci sequence as the "fibonacci counter".
    @Test
    public void EvenFibonacciTest()
    {
        assertEquals(9227464, ArraySummer.sumUpArray(fibCount.getSequence()));
    }
}
