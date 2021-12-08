package challenges;

import challenges.PalindromicNameChecker;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import  static org.junit.jupiter.api.Assertions.assertTrue;
import  static org.junit.jupiter.api.Assertions.assertFalse;
import  static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromicNameCheckerTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }


    @Test
    public void palindromeTests()
    {
        //Does it give true for palindromic names and false for non-palindromic names?
        assertTrue(PalindromicNameChecker.checkSingleNamePalindromic("makam"));
        assertFalse(PalindromicNameChecker.checkSingleNamePalindromic("james"));
    }

    @Test
    public void syntaxTest()
    {
        //Should work even with capitals
        assertTrue(PalindromicNameChecker.checkSingleNamePalindromic("Jamaj"));
        //Test for special characters. No reason not to work, but worth checking.
        assertTrue(PalindromicNameChecker.checkSingleNamePalindromic("/'/&/'/"));
        //This should technically return true, as nothing is still nothing backwards.
        assertTrue(PalindromicNameChecker.checkSingleNamePalindromic(""));
        //This should say false because there are two names.
        assertFalse(PalindromicNameChecker.checkSingleNamePalindromic("jamaj dorlrod"));
    }

    //Tests for full sentences (Loops through and uses the single sentence function so doesnt need same tests as before

    @Test
    public void sentenceTests()
    {
        //Test for amount
        assertEquals(2, PalindromicNameChecker.checkHowManyPalindromes("jamaj name makam palindrome"));
        //Test for punctuation. Punctuation is removed, so the words will come together.
        assertEquals(2, PalindromicNameChecker.checkHowManyPalindromes("j#a~maj, name. ma[]k.am palindrome"));
        //Test for none
        assertEquals(0, PalindromicNameChecker.checkHowManyPalindromes("None of these words are palindromic"));
        //Test for all
        assertEquals(5, PalindromicNameChecker.checkHowManyPalindromes("alla ofo theseht ara palindromicimordnilap"));
    }
}
