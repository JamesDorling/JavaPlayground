package challenges.week_1;

import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertEquals;


public class Challenge3Tests {
    CoinFlipEqualiser thirdChall = new CoinFlipEqualiser();

    @Test
    public void amountTests()
    {
        //Test with just 1s, no 0s. If this works, then the system works.
        assertEquals(1, thirdChall.neededFlips(new int[]{1, 1}));
        //Test with even amounts
        assertEquals(0, thirdChall.neededFlips(new int[]{1, 0}));
        //Test with odd numbers (Should fail and therefore return -1)
        assertEquals(-1, thirdChall.neededFlips(new int[]{1, 1, 1, 1, 1, 0, 0}));
    }
}
