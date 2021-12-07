package challenges;

import core.fibonacci.FibonacciCounter;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenFibonacciSum {
    private FibonacciCounter fibCounter;
    private ArrayList<Integer> fibSequence;

    public EvenFibonacciSum(int limit) {
        this.fibCounter = new FibonacciCounter(limit, 1, 1);
        this.fibSequence = this.fibCounter.getSequence();
        removeOddNumbers();
    }

    private void removeOddNumbers()
    {
        Iterator<Integer> fibIterator = fibSequence.iterator();
        while (fibIterator.hasNext())
        {
            int i = fibIterator.next();
            if(i % 2 != 0) {
                fibIterator.remove();
            }
        }
    }

    public ArrayList<Integer> getFibSequence() {
        return fibSequence;
    }
}
