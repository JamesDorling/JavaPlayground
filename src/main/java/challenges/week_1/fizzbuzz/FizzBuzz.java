package challenges.week_1.fizzbuzz;

import java.util.ArrayList;

public class FizzBuzz {
    /*
    For through the numbers
    if statements, if divisible by 3 then output fizz, 5 then buzz, 3 and 5 then fizzbuzz.
    */

    public static ArrayList<Object> fizzBuzzOb(int bound)
    {
        //Predefine outputList
        ArrayList<Object> outputList = new ArrayList<Object>();
        //Loop through each number
        for(int i = 1; i <= bound; i++)
        {
            //Predefine a string to easily add things to the string
            String forOutput = "";
            if(divisibleBy(i, 3)) {
                forOutput += "Fizz";
            }
            if(divisibleBy(i, 5)) {
                forOutput += "Buzz";
            }
            else if(!divisibleBy(i, 3)) {
                outputList.add(i);
            }
            //Add the output to the list if it isnt empty
            if(!forOutput.equals("")) {
                outputList.add(forOutput);
            }
        }
        //Print the output so I can read it because I want to.
        System.out.println(outputList);
        //Return the object arraylist
        return outputList;
    }

    public static ArrayList<String> fizzBuzzString(int bound)
    {
        //Predefine outputList
        ArrayList<String> outputList = new ArrayList<String>();
        //Loop through each number
        for(int i = 1; i <= bound; i++)
        {
            //Predefine a string to easily add things to the string
            String forOutput = "";
            if(divisibleBy(i, 3)) {
                forOutput += "Fizz";
            }
            if(divisibleBy(i, 5)) {
                forOutput += "Buzz";
            }
            else if(!divisibleBy(i, 3)) {
                forOutput += i;
            }
            //Add the output to the list

            outputList.add(forOutput);

        }
        //Print the output so I can read it because I want to.
        System.out.println(outputList);
        //Return the object arraylist
        return outputList;
    }

    private static boolean divisibleBy(int divided, int divider)
    {
        //Return if it is divisible
        return (divided % divider == 0);
    }
}
