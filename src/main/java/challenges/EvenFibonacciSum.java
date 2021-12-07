package challenges;

import core.fibonacci.FibonacciCounter;

import java.util.ArrayList;

public class EvenFibonacciSum {
    private FibonacciCounter fibCounter;
    private ArrayList<Integer> fibSequence;

    public EvenFibonacciSum(int limit) {
        this.fibCounter = new FibonacciCounter(limit);
        this.fibSequence = this.fibCounter.getSequence();
        removeOddNumbers();
    }

    private void removeOddNumbers()
    {
        for(Integer i: fibSequence)
        {
            if(i % 2 == 0)
            {
                this.fibSequence.remove(i);
            }
        }
    }

    public ArrayList<Integer> getFibSequence() {
        return fibSequence;
    }
}
