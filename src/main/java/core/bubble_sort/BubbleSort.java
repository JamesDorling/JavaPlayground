package core.bubble_sort;


import java.util.ArrayList;
import java.util.Collection;

public interface BubbleSort<T> {
    T[] getArray();
    //Each bubbleSort will need to actually bubblesort something
    int getIterations();
    int getSwaps();
    long getTimeTaken();
}
