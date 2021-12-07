package challenges;

import  static org.junit.jupiter.api.Assertions.assertTrue;

import challenges.AscendWordSizes;
import org.junit.jupiter.api.Test;

public class Challenge2Tests {

    @Test
    public void correctOrderTest()
    {
        assertTrue(AscendWordSizes.ascendWordSizesToString("The order will change").equals("The will order change"));
    }

    @Test
    public void syntaxTest()
    {
        //No real reason for these not to work, but I figure its worth testing anyway
        assertTrue(AscendWordSizes.ascendWordSizesToString("!£$%^&? \"|():@~29854 actualword").equals("!£$%^&? actualword \"|():@~29854"));
        assertTrue(AscendWordSizes.ascendWordSizesToString("").equals(""));
    }

    @Test
    public void timeTest()
    {
        //Get the time in milliseconds, tun the function then get the time in milliseconds again. Then compare the two to get the duration.
        long start = System.currentTimeMillis();
        AscendWordSizes.ascendWordSizesToString("The order will change").equals("The will order change");
        long end = System.currentTimeMillis();
        //Should be less than 5 milliseconds
        assertTrue((end - start) < 5);
    }

    @Test
    public void iterationsTest()
    {

    }

    /*
    I have not tested the arraylist one as in this scenario the ArrayList function is not the one used to clear the
    challenge.
    */
}
