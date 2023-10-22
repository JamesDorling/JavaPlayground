package challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class AscendWordSizesTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @Test
    public void correctOrderTest() {
        assertEquals("The will order change", AscendWordSizes.ascendWordSizesToString("The order will change"));
    }

    @Test
    public void syntaxTest() {
        //No real reason for these not to work, but I figure its worth testing anyway
        assertEquals("!£$%^&? actualword \"|():@~29854", AscendWordSizes.ascendWordSizesToString("!£$%^&? \"|():@~29854 actualword"));
    }

    @Test
    public void blankTest() {
        assertEquals("", AscendWordSizes.ascendWordSizesToString(""));
    }

    @Test
    public void timeTest() {
        //Get the time in milliseconds, tun the function then get the time in milliseconds again. Then compare the two to get the duration.
        long start = System.currentTimeMillis();
        AscendWordSizes.ascendWordSizesToString("The order will change").equals("The will order change");
        long end = System.currentTimeMillis();
        //Should be less than 5 milliseconds
        assertTrue((end - start) < 5);
    }

    /*
    I have not tested the arraylist one as in this scenario the ArrayList function is not the one used to clear the
    challenge.
    */
}
