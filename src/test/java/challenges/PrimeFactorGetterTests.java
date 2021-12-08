package challenges;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import  static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrimeFactorGetterTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @Test
    public void checkPrimeFactorsIntegerTest() {
        assertArrayEquals(new Integer[]{5, 7, 13, 29}, PrimeFactorGetter.getFactors(13195).toArray(new Integer[0]));
    }

    @Test
    public void checkPrimeFactorsLongTest() {
        assertArrayEquals(new Long[]{5L, 7L, 13L, 29L}, PrimeFactorGetter.getFactors(13195L).toArray(new Long[0]));
    }
}
