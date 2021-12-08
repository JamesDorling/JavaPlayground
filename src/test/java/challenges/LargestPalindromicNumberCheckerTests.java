package challenges;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import  static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPalindromicNumberCheckerTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @Test
    public void largestPalindromeCheck() {
        //This test also tests the projectEuler third challenge.
        int palindromicNum = LargestPalindromicNumberChecker.getLargestPalindromicNumber(999, 999);
        assertEquals(906609, palindromicNum);
    }
}
