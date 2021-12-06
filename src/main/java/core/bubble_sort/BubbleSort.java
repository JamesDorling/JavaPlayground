package core.bubble_sort;


import java.util.ArrayList;

public interface BubbleSort<T> {
    ArrayList<T> getArrayList();
    //Each bubbleSort will need to actually bubblesort something
    int getIterations();
    int getSwaps();
    long getTimeTaken();
}
