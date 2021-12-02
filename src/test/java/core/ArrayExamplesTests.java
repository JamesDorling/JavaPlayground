package core;

import  static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayExamplesTests {
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
