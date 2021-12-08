package challenges;

import core.array_functions.ArraySummer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import  static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenFibonacciSumTests {


    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    //4 million for the ProjectEuler question
    EvenFibonacciSum fibCount = new EvenFibonacciSum(4000000);
    //order is unnecessary as is using the same function to calculate the fibonacci sequence as the "fibonacci counter".

    @Test
    public void EvenFibonacciTest()
    {
        assertEquals(4613732, ArraySummer.sumUpArray(fibCount.getFibSequence()));
    }
}
