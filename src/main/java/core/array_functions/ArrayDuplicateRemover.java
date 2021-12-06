package core.array_functions;

import java.util.HashMap;

public class ArrayDuplicateRemover {
    public static Integer[] removeDuplicateElements(Integer[] arrayToDedupe)
    {
        return fillResultArray(arrayToDedupe, getResultSize(arrayToDedupe));
    }

    private static int getResultSize(Integer[] arrayToCheckForDupes)
    {
        //I was sat here for 3 hours because I kept using "arrayToCheckForDupes[i]" instead of just "i" forgetting that this wasn't an int i for loop.
        //Go through the array and add one to result for each unique element.
        int result = 0;
        //lastElement to track the last added element so no duplicates
        Integer lastElement = null;
        //Loop through the elements and add 1 to result for every one that is unique
        for (Integer i : arrayToCheckForDupes)
        {
            if(lastElement != i)
            {
                //Add one to result and set the lastElement to i;
                result += 1;
                lastElement = i;
            }
        }
        //return the list size
        return result;
    }

    private static Integer[] fillResultArray(Integer[] arrayWithDupes, int resultSize)
    {
        //Go through the array and add each unique element.
        //Predefine result, index and lastElement
        Integer[] result = new Integer[resultSize];
        int index = 0;
        Integer lastElement = null;
        //Loop through each element adding the unique ones using the index
        for (Integer i : arrayWithDupes)
        {
            if(lastElement != i)
            {
                //Tick up the index with every added result
                result[index] = i;
                index += 1;
                lastElement = i;
            }
        }
        return result;
    }
}
