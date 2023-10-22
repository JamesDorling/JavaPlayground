package core.array_functions;

import java.util.ArrayList;

public class ArraySummer {
    public static int sumUpArray(ArrayList<Integer> list1)
    {
        //This function uses a for loop to iterate through each number in an arraylist and add them together.
        int sum = 0;
        for(Integer num: list1)
        {
            sum += num;
        }
        return sum;
    }
}
