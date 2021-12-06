package challenges.week_1;

import java.util.Scanner;

public class PalindromicNameChecker {
    public static boolean checkSingleNamePalindromic()
    {
        System.out.println("What is the name you would like to check?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        //Initialise a string to add the characters to
        String backName = "";
        //Loop through each character
        for(int i = 0; i < name.length(); i++)
        {
            //Add each character to a string backwards
            backName += name.toLowerCase().charAt(name.length()-(i + 1)); //Concatenation in a loop is probably horrendous practice as strings are immutable.
        }
        //Use .equals (because == doesnt work with string) to compare the name backwards to the regular name, returning a boolean
        if(backName.equals(name.toLowerCase()))
        {
            System.out.println("Name is palindromic.");
        }
        else
        {
            System.out.println("Name is not palindromic.");
        }
        return backName.equals(name.toLowerCase());
    }

    public static boolean checkSingleNamePalindromic(String name)
    {
        //Initialise a string to add the characters to
        String backName = "";
        //Loop through each character
        for(int i = 0; i < name.length(); i++)
        {
            //Add each character to a string backwards
            backName += name.toLowerCase().charAt(name.length()-(i + 1));
        }
        //Use .equals (because == doesnt work with string) to compare the name backwards to the regular name, returning a boolean
        return backName.equals(name.toLowerCase());
    }

    public static int checkHowManyPalindromes(String sentence)
    {
        //Predefine the result
        int result = 0;
        //Remove all punctuation from the sentence (Figured this code out a few days ago and ive been waiting for a chance to give it a go :D)
        sentence = sentence.replaceAll("\\p{Punct}", "");
        //Split the sentence (We werent told not to this time, but Ill try it without if requested)
        String[] words = sentence.split(" ");
        //Loop through each word and check if it is palindromic
        for(int i = 0; i < words.length; i++)
        {
            // Add 1 to result for every palindrome
            if(checkSingleNamePalindromic(words[i]))
            {
                result += 1;
            }
        }
        //Return the number of palindromes
        return result;
    }
}
