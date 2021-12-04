package challenges.week_1;

import java.util.Scanner;

public class Challenge4 {
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
}
