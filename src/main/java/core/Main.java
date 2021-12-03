package core;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Make an empty ArrayList of integers (Base size is 10, but here I've set it to 2.)
        ArrayList<Integer> exampleArrayList = new ArrayList<Integer>(2);
        //Add the number 1 onto the ArrayList
        exampleArrayList.add(1);
        //Add the number 2 onto the ArrayList
        exampleArrayList.add(50);
        //If the array contains 10, then this will say that. This cannot happen with the above code, as 10 is never input.
        if(exampleArrayList.contains(10)) {
            //This will remove the second object in the ArrayList as indexing starts at 0.
            exampleArrayList.remove(1);
        }
        else
        {
            //Here is how yo uwould get the ArrayList's size
            int arrayListSize = exampleArrayList.size();
            //This will turn the ArrayList into a string.
            String outputText = exampleArrayList.toString();
            //This will output the ArrayList and the size.
            System.out.println(outputText + " Size of ArrayList: " + arrayListSize);
        }
    }
}
