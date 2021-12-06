package core;

import core.bubble_sort.BubbleSort;
import core.bubble_sort.BubbleSortInt;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Make a list of random ints
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 2, 4, 3, 6, 8, 100, 2, 5, 6));
        //Sort the ints with a bubblesort
        BubbleSort sorter = new BubbleSortInt(list);

        //set the list
        list = sorter.getArrayList();
        System.out.println(sorter.getIterations());
        System.out.println(sorter.getSwaps());
        System.out.println(sorter.getTimeTaken());
        System.out.println(list);

    }
}
