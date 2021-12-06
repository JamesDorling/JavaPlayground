package core.bubble_sort;


public class BubbleSortStringWordSize implements BubbleSort<String>{
    int iterations = 0;
    int swaps = 0;
    long time_taken = 0;
    String[] sorted_list;

    public BubbleSortStringWordSize(String[] listToSort)
    {
        long start = System.currentTimeMillis();
        //A bubble sort algorithm. Will constantly set sorted between true and false until no more changes need to be made.
        boolean sorted = false;
        while (!sorted)
        {
            iterations += 1;
            sorted = true;
            for(int i = 0; i < listToSort.length-1; i++)
            {
                //If the selected word is longer than the next one
                if (listToSort[i].length() > listToSort[i + 1].length())
                {
                    swaps += 1;
                    //Save the selected string temporarily
                    String temp = listToSort[i];
                    //Move the next string back by one
                    listToSort[i] = listToSort[i];
                    //replace the next string with the selected string
                    listToSort[i + 1] = temp;
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
    public String[] getArray() {
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
