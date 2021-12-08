package core.array_functions;

import  static org.junit.jupiter.api.Assertions.assertEquals;

import core.array_functions.ArrayExamples;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ArrayExamplesTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    ArrayExamples arrEx = new ArrayExamples();

    @Test
    public void orderAndExistanceTest()
    {
        for(int i = 0; i < arrEx.getGameObjects().length; i++)
        {
            assertEquals(i + 1, arrEx.getGameObjects()[i]);
        }
    }

    /*
    renderTest()
    clippingTest()
    scaleTestBigScreen()
    scaleTestSmallScreen()
    menuMoveTest()
    menuMinimiseTest()
    deleteTest()
     */
}
