package challenges;

import core.array_functions.ArraySummer;
import core.fibonacci.FibonacciCounter;
import org.junit.jupiter.api.Test;

import  static org.junit.jupiter.api.Assertions.assertEquals;
import  static org.junit.jupiter.api.Assertions.assertArrayEquals;
import  static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenFibonacciSumTests {
    //4 million for the ProjectEuler question
    EvenFibonacciSum fibCount = new EvenFibonacciSum(4000000);
    //order is unnecessary as is using the same function to calculate the fibonacci sequence as the "fibonacci counter".

    @Test
    public void EvenFibonacciTest()
    {
        assertEquals(4613732, ArraySummer.sumUpArray(fibCount.getFibSequence()));
    }
}
