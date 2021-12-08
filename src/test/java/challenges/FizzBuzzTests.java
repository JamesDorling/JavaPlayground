package challenges;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import  static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;

public class FizzBuzzTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    ArrayList<String> tester = FizzBuzz.fizzBuzzString(15);

    //MOST EFFICIENT TEST TESTS THE FIRST 15 AGAINST ANOTHER ARRAY OF 15. IF THE FIRST 15 ARE CORRECT, THEN EVERYTHING IS CORRECT.

    @Test
    public void fizzBuzzGenerator() {
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, tester.toArray());
    }
}
