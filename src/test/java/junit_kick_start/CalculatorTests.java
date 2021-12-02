package junit_kick_start;

import  static org.junit.jupiter.api.Assertions.assertEquals;
import  static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    Calculator calc = new Calculator();

    @Test
    public void additionTest(){
        assertEquals(10, calc.add(4, 6));
    }

    @Test
    public void additionTest2(){
        assertNotEquals(10, calc.add(2, 3));
    }

}
