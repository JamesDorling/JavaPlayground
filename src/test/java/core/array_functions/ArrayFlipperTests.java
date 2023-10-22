package core.array_functions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayFlipperTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @Test
    public void arrayFlipTest()
    {
        assertArrayEquals(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, ArrayFlipper.flipArray(new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    }
}
