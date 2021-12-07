package challenges;

import core.array_functions.ArraySummer;

import java.util.ArrayList;

public class SumOfMultiples {
    private static ArrayList<Integer> getMultiples(int numMultiplesBelow, int num1)
    {
        //This function adds each multiple of "num1" below "numMultiplesBelow" to an array list using a for loop.
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < numMultiplesBelow; i++)
        {
            if(i % num1 == 0)
            {
                numbers.add(i);
            }
        }
        return numbers;
    }

    private static ArrayList<Integer> removeDupes(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        /*
        This function goes through two lists of arrays and removes any duplicate numbers.
        It does this by going through list2, checking each value to see if it is in list1 and if it isnt then adding it.
        This could be very costly in large data sets, as I do not know what search method ".contains" uses. I assume
        it is linear, which would not be very good.
        */
        for (Integer i: list2)
        {
            if(!(list1.contains(i)))
            {
                list1.add(i);
            }
        }

        return list1;
    }

    public static int Challenge_1(int upperBound, int multiplesOf)
    {
        ArrayList<Integer> multList = getMultiples(upperBound, multiplesOf);

        return ArraySummer.sumUpArray(multList);

    }

    public static int Challenge_1(int upperBounds, int[] multiplesOf)
    {
        ArrayList<Integer> multList = new ArrayList<Integer>();
        for(int i = 0; i < multiplesOf.length; i++)
        {
            multList.addAll(getMultiples(upperBounds, multiplesOf[i]));
        }

        return ArraySummer.sumUpArray(multList);

    }
}