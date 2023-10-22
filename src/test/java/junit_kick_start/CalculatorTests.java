package junit_kick_start;

import  static org.junit.jupiter.api.Assertions.assertEquals;
import  static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class CalculatorTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }


    @Test
    public void additionTest(){
        assertEquals(10, Calculator.add(4, 6));
    }

    @Test
    public void additionTest2(){
        assertNotEquals(10, Calculator.add(2, 3));
    }

}
