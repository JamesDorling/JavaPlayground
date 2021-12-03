package challenges.week_1.fizzbuzz;

import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertTrue;
import  static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;

public class FizzBuzzTests {
    FizzBuzz fibu = new FizzBuzz();
    ArrayList<String> tester = FizzBuzz.fizzBuzzString(15);

    //MOST EFFICIENT TEST TESTS THE FIRST 15 AGAINST ANOTHER ARRAY OF 15. IF THE FIRST 15 ARE CORRECT, THEN EVERYTHING IS CORRECT.

    @Test
    public void fizzBuzzTestObject() {
        //Index starts at 0, 14 is the 15th place
        assertTrue(tester.get(14).equals("FizzBuzz"));
        assertFalse(tester.get(14).equals(15));

        assertTrue(tester.get(2).equals("Fizz"));
        assertFalse(tester.get(2).equals(3));

        assertTrue(tester.get(4).equals("Buzz"));
        assertFalse(tester.get(4).equals(5));

    }

    @Test
    public void fizzBuzzTestString()
    {
        assertTrue(tester.get(14).equals("FizzBuzz"));
        assertFalse(tester.get(14).equals(15));

        assertTrue(tester.get(2).equals("Fizz"));
        assertFalse(tester.get(2).equals(3));

        assertTrue(tester.get(4).equals("Buzz"));
        assertFalse(tester.get(4).equals(5));
    }

    @Test
    public void numberTestString()
    {
        assertTrue(tester.get(10).equals("11"));
        assertFalse(tester.get(10).equals("Fizz"));
        assertFalse(tester.get(10).equals("Buzz"));
        assertFalse(tester.get(10).equals("FizzBuzz"));
        //Go through and test that each number that exists is correct
        for(int i = 0; i < tester.size(); i++)
        {
            int NumberToBeTested;
            try{
                //Try and parse the string to an int
                NumberToBeTested = Integer.parseInt(tester.get(i));
                //Assert that the number cannot be divided by 3 or 5
                assertFalse(NumberToBeTested % 3 == 0);
                assertFalse(NumberToBeTested % 5 == 0);
                //If the string is "Fizz", "Buzz" or "FizzBuzz" then this will continue as normal
            } catch (NumberFormatException e) {}
        }
    }

    @Test
    public void syntaxTest()
    {
        assertTrue(tester.size() == 15);
    }
}
