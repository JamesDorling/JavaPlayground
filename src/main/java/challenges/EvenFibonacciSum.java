package challenges;

import java.util.ArrayList;

public class EvenFibonacciSum {
    public static ArrayList<Integer> getFibonacciNumbers()
    {
        //Make the resulting integer and add the first two numbers
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(1);
        //Boolean for if it is higher than 4 million, as I don't need to go above that
        boolean higherThan4Million = false;
        //While we are dealing with numbers bellow 4 million
        while (!higherThan4Million)
        {
            //Check if the number is higher than 4 million, if not then add the last two and loop again
            if(result.get(-1) >= 4000000) { higherThan4Million = true; }
            else {result.add((result.get(-1) + result.get(-2))); }
        }
        return removeOddNumbers(result);
    }
    /*
    This is almost all we need, but I only need even numbers. The options are edit this to only take even numbers, or make another function.
    Editing this would be the most efficient, and normally I would do this. However, making a new function is more work, and that is what I
    am looking for.
    */
    public static ArrayList<Integer> removeOddNumbers(ArrayList<Integer> arrayOfInts) {

        return null;
    }
}
