package core.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciCounter {
    private ArrayList<Integer> sequence = new ArrayList<Integer>(Arrays.asList(1, 1));
    public FibonacciCounter(int limit)
    {
        FibonacciAdd(1, 1, limit);
    }

    private void FibonacciAdd(Integer num1, Integer num2, int limit)
    {
        Integer newNum = num1 + num2;
        if(newNum < limit) {
            sequence.add(num1 + num2);
            FibonacciAdd(sequence.get(sequence.size() - 1), sequence.get(sequence.size() - 2), limit);
        }
    }

    public ArrayList<Integer> getSequence() {
        return sequence;
    }
}
