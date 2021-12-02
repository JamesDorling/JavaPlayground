package challenges.week_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge2 {
    public static ArrayList<String> ascendWordSizes(String sentence)
    {
        //Create an arrayList to store the seperate words
        ArrayList<String> seperateWords = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
        //A bubble sort algorithm. Will constantly set sorted between true and false until no more changes need to be made.
        boolean sorted = false;
        while (!sorted)
        {
            sorted = true;
            for(int i = 0; i < seperateWords.size()-1; i++)
            {
                //If the selected word is longer than the next one
                if (seperateWords.get(i).length() > seperateWords.get(i+1).length())
                {
                    //Save the selected string temporarily
                    String temp = seperateWords.get(i);
                    //Move the next string back by one
                    seperateWords.set(i, seperateWords.get(i+1));
                    //replace the next string with the selected string
                    seperateWords.set(i+1, temp);
                    //Change has been made so the list is not yet sorted
                    sorted = false;
                }
            }
        }
        //Return the sorted list
        return seperateWords;
    }

    public static void challenge_2()
    {
        System.out.println(ascendWordSizes("This is a test to see if challenge 2 is completed"));
    }
}
