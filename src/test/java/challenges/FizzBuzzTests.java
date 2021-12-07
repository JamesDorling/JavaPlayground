package challenges;

import challenges.FizzBuzz;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;

public class FizzBuzzTests {
    ArrayList<String> tester = FizzBuzz.fizzBuzzString(15);

    //MOST EFFICIENT TEST TESTS THE FIRST 15 AGAINST ANOTHER ARRAY OF 15. IF THE FIRST 15 ARE CORRECT, THEN EVERYTHING IS CORRECT.

    @Test
    public void fizzBuzzGenerator() {
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, tester.toArray());
    }
}
