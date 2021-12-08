package challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LongSummaryStatistics;

import  static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrimeFactorGetterTests {
    @Test
    public void checkPrimeFactorsTest()
    {
        Integer[] expected = new Integer[]{5, 7, 13, 29};
        assertArrayEquals(expected, PrimeFactorGetter.getFactors(13195).toArray(new Integer[0]));
        Long[] expectedLong = new Long[]{5L, 7L, 13L, 29L};
        assertArrayEquals(expectedLong, PrimeFactorGetter.getFactors(13195L).toArray(new Long[0]));
    }
}
