package challenges;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LongSummaryStatistics;

import  static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrimeFactorGetterTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @Test
    public void checkPrimeFactorsTest()
    {
        Integer[] expected = new Integer[]{5, 7, 13, 29};
        assertArrayEquals(expected, PrimeFactorGetter.getFactors(13195).toArray(new Integer[0]));
        Long[] expectedLong = new Long[]{5L, 7L, 13L, 29L};
        assertArrayEquals(expectedLong, PrimeFactorGetter.getFactors(13195L).toArray(new Long[0]));
    }
}
