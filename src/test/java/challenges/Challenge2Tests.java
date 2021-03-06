package challenges;

import  static org.junit.jupiter.api.Assertions.assertTrue;

import challenges.AscendWordSizes;
import org.junit.jupiter.api.Test;

public class Challenge2Tests {

    @Test
    public void correctOrderTest()
    {
        assertTrue(AscendWordSizes.ascendWordSizesToString("The order will change").equals("The will order change"));
        //ISSUE ONE my use of arraylists causes strange formatting in the returned string. I fixed this with String[].
        //ISSUE TWO re-concatenating the string ended up with a space at the end. Fixed by checking if the word was last before adding a space.
        //as much as I would like to leave it here and be like "hurray it works" I feel that goes against the idea of learning.
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
