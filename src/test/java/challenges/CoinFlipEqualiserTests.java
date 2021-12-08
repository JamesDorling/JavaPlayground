package challenges;

import challenges.CoinFlipEqualiser;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import  static org.junit.jupiter.api.Assertions.assertEquals;


public class CoinFlipEqualiserTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @Test
    public void amountTests()
    {
        //Test with just 1s, no 0s. If this works, then the system works.
        assertEquals(1, CoinFlipEqualiser.neededFlips(new int[]{1, 1}));
        //Test with even amounts
        assertEquals(0, CoinFlipEqualiser.neededFlips(new int[]{1, 0}));
        //Test with odd numbers (Should fail and therefore return -1)
        assertEquals(-1, CoinFlipEqualiser.neededFlips(new int[]{1, 1, 1, 1, 1, 0, 0}));
    }
}
