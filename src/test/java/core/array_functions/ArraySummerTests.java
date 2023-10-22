package core.array_functions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.ArrayList;
import java.util.Arrays;

import  static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySummerTests {

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) { System.out.println(testInfo.getTestClass() + " has completely finished testing."); }

    @Test
    public void arraySumTest(){
        //Test to sum array
        assertEquals(5, ArraySummer.sumUpArray(new ArrayList<Integer>(Arrays.asList(1, 1, 3))));
    }
}
