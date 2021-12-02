package challenges.week_1;

import  static org.junit.jupiter.api.Assertions.assertEquals;
import  static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class Challenge1Tests {
    private Challenge1 firstChall = new Challenge1();

    //Single set tests
    //////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void numTest() {
        assertEquals(10, firstChall.Challenge_1(5, 1));
        assertEquals(249500, firstChall.Challenge_1(1000, 2));  //Calculated this one manually. Was not an enjoyable passtime.
        assertNotEquals(firstChall.Challenge_1(10, 2), firstChall.Challenge_1(10, 1));
        assertNotEquals(0, firstChall.Challenge_1(10, 1));
    }

    @Test
    public void tooBigMultTest() {
        assertEquals(0, firstChall.Challenge_1(1, 2));
    }

    @Test
    public void negativeInputTest() {
        assertEquals(0, firstChall.Challenge_1(-10, 1));
        assertEquals(20, firstChall.Challenge_1(10, -2)); //This seems to take the "multiples of" value like it is unsigned.
        assertEquals(0, firstChall.Challenge_1(-10, -1));
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////

    //Multiple set tests
    //////////////////////////////////////////////////////////////////////////////////////////////////
    //Not looking forward to manually calculating these ones. I made challenge1 accept arrays of inputs.

    @Test
    public void numTestMulti() {
        assertEquals(16, firstChall.Challenge_1(5, new int[]{1, 2}));
        //FIRST ISSUE I made the system rewrite the arraylist of numbers created by "getMultiples()", and therefore would only do the last number in the "multiplesof" array
        assertEquals(12249, firstChall.Challenge_1(300, new int[]{10, 15, 9}));
        assertNotEquals(firstChall.Challenge_1(10, new int[]{1, 2}), firstChall.Challenge_1(10, new int[]{3, 4}));
        assertNotEquals(0, firstChall.Challenge_1(10, new int[]{1, 2}));

    }

    @Test
    public void tooBigMultTestMulti()
    {
        assertEquals(0, firstChall.Challenge_1(1, new int[]{2, 3, 4, 5, 100, 1000}));
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////

}
