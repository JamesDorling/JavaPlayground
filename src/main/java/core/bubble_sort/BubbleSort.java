package core.bubble_sort;

public interface BubbleSort<T> {
    T[] getArray();
    //Each bubbleSort will need to actually bubblesort something
    int getIterations();
    int getSwaps();
    long getTimeTaken();
}
