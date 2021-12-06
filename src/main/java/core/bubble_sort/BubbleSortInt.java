package core.bubble_sort;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortInt implements BubbleSort<Integer>{
    int iterations = 0;
    int swaps = 0;
    long time_taken = 0;
    ArrayList<Integer> sorted_list;

    public BubbleSortInt(ArrayList<Integer> listToSort)
    {
        long start = System.currentTimeMillis();
        //A bubble sort algorithm. Will constantly set sorted between true and false until no more changes need to be made.
        boolean sorted = false;
        while (!sorted)
        {
            iterations += 1;
            sorted = true;
            for(int i = 0; i < listToSort.size()-1; i++)
            {
                //If the selected word is longer than the next one
                if (listToSort.get(i) > listToSort.get(i+1))
                {
                    swaps += 1;
                    //Save the selected string temporarily
                    Integer temp = listToSort.get(i);
                    //Move the next string back by one
                    listToSort.set(i, listToSort.get(i+1));
                    //replace the next string with the selected string
                    listToSort.set(i+1, temp);
                    //Change has been made so the list is not yet sorted
                    sorted = false;
                }
            }
        }
        //Set the time taken
        time_taken = System.currentTimeMillis() - start;
        //Set the sorted list
        sorted_list = listToSort;
    }

    @Override
    public ArrayList getArrayList() {
        return sorted_list;
    }

    @Override
    public int getIterations() {
        return iterations;
    }

    @Override
    public int getSwaps() {
        return swaps;
    }

    @Override
    public long getTimeTaken() {
        return time_taken;
    }
}
