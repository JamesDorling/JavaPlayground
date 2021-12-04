package challenges.week_1;

import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertTrue;
import  static org.junit.jupiter.api.Assertions.assertFalse;

public class Challenge4Tests {
    Challenge4 fourthChall = new Challenge4();

    @Test
    public void palindromeTests()
    {
        //Does it give true for palindromic names and false for non-palindromic names?
        assertTrue(fourthChall.checkSingleNamePalindromic("makam"));
        assertFalse(fourthChall.checkSingleNamePalindromic("james"));
    }

    @Test
    public void syntaxTest()
    {
        //Should work even with capitals
        assertTrue(fourthChall.checkSingleNamePalindromic("Jamaj"));
        //Test for special characters. No reason not to work, but worth checking.
        assertTrue(fourthChall.checkSingleNamePalindromic("/'/&/'/"));
        //This should technically return true, as nothing is still nothing backwards.
        assertTrue(fourthChall.checkSingleNamePalindromic(""));
        //This should say false because there are two names.
        assertFalse(fourthChall.checkSingleNamePalindromic("jamaj dorlrod"));
    }
}
