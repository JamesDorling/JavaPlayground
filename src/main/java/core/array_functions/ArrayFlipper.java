package core.array_functions;

public class ArrayFlipper {
    public static Integer[] flipArray(Integer[] arrayToFlip)
    {
        //Predefine the result as an integer of the same length as the array to flip
        Integer[] result = new Integer[arrayToFlip.length];
        //flip the array with a for loop
        for(int i = 0; i < arrayToFlip.length; i++)
        {
            //reverse the list (length is -1 because indexing)
            result[i] = arrayToFlip[(arrayToFlip.length - 1) - i];
        }
        return result;
    }
}
