package core.array_functions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import  static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySummerTests {
    @Test
    public void arraySumTest(){
        //Test to sum array
        assertEquals(5, ArraySummer.sumUpArray(new ArrayList<Integer>(Arrays.asList(1, 1, 3))));
    }
}
