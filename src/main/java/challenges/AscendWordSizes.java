package challenges;

import java.util.ArrayList;
import java.util.Arrays;

public class AscendWordSizes {
    public static ArrayList<String> ascendWordSizes(String sentence)
    {
        //Create an arrayList to store the seperate words
        ArrayList<String> seperateWords = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
        //A bubble sort algorithm. Will constantly set sorted between true and false until no more changes need to be made.
        boolean sorted = false;
        int iterations = 0;
        while (!sorted)
        {
            iterations += 1;
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

    public static String ascendWordSizesToString(String sentence)
    {
        //Create an arrayList to store the seperate words
        String[] seperateWords = sentence.split(" ");
        //A bubble sort algorithm. Will constantly set sorted between true and false until no more changes need to be made.
        boolean sorted = false;
        while (!sorted)
        {
            sorted = true;
            for(int i = 0; i < seperateWords.length-1; i++)
            {
                //If the selected word is longer than the next one
                if (seperateWords[i].length() > seperateWords[i+1].length())
                {
                    //Save the selected string temporarily
                    String temp = seperateWords[i];
                    //Move the next string back by one
                    seperateWords[i] = seperateWords[i+1];
                    //replace the next string with the selected string
                    seperateWords[i+1] = temp;
                    //Change has been made so the list is not yet sorted
                    sorted = false;
                }
            }
        }
        //Predefine the final sentence
        String finalSentence = "";
        for(String word: seperateWords)
        {
            //Concatenate the words
            finalSentence += word;
            //Minus one to get the final one in the length (Index is from 0)
            if(word != seperateWords[seperateWords.length - 1])
            {
                finalSentence += " ";
            }
        }
        //Return the newly concatenated list as one string.
        return finalSentence;
    }
}
