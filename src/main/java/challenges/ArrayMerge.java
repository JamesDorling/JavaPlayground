package challenges;

import core.array_functions.ArrayDuplicateRemover;
import core.array_functions.ArrayFlipper;
import core.bubble_sort.BubbleSortIntArray;

public class ArrayMerge {
    //I either make this with "Integer" or I make loops transforming "int[]" to "Integer[]" and nobody wants to see that
    private Integer[] mergedArray;
    private BubbleSortIntArray sorter;

    public ArrayMerge(Integer[] array1, Integer[] array2)
    {
        //Predefine array of correct size
        Integer[] result = new Integer[array1.length + array2.length];
        //add array1's data
        for(int i = 0; i < array1.length; i++)
        {
            result[i] = array1[i];
        }
        //add array2's data
        for(int j = array1.length; j < result.length; j++)
        {
            result[j] = array2[j - array1.length];
        }
        //Set the mergedArray
        mergedArray = result;
    }

    public Integer[] getMergedArray() {
        return mergedArray;
    }

    public Integer[] getMergedArraySorted() {
        sorter = new BubbleSortIntArray(mergedArray);
        return sorter.getArray();
    }
    public Integer[] getMergedArraySortedBackwards() {
        sorter = new BubbleSortIntArray(mergedArray);
        //Return the flipped array
        return ArrayFlipper.flipArray(sorter.getArray());
    }

    public Integer[] getMergedArrayDupeless() {
        return ArrayDuplicateRemover.removeDuplicateElements(getMergedArraySorted());
        /*
        ONLY TAKES SORTED ARRAYS. Cannot remove dupes from unsorted arrays, as a regular array does not have a .contains
        method and would take an inordinate amount of time to search through every time, when sorting would fix this
        easily.
        */
    }
}
