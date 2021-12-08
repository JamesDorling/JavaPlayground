package challenges;

import org.junit.jupiter.api.Test;

import  static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPalindromicNumberCheckerTests {
    @Test
    public void largestPalindromeCheck() {
        //This test also tests the projectEuler third challenge.
        int palindromicNum = LargestPalindromicNumberChecker.getLargestPalindromicNumber(999, 999);
        assertEquals(906609, palindromicNum);
    }
}
