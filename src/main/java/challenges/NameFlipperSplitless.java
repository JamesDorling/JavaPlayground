package challenges;

import java.util.ArrayList;

public class NameFlipperSplitless {
    public static String reverseSingleNameSplitless(String name)
    {
        //The strings that the name will be put into
        String forename, surname;
        //Where is the space? THIS WILL NEED EDITING TO WORK WITH MIDDLE NAMES TOO. WILL CURRENTLY SAY "Dorling James Robert" FOR MY FULL NAME.
        int seperation = 0;
        //Go through the string, and record the place that a space is at.
        for(int i = 0; i < name.length(); i++)
        {
            if(name.charAt(i) == ' ')
            {
                seperation = i;
            }
        }
        //Get the forename from 0 to the space
        forename = name.substring(0, seperation);
        //Seperation + 1 to skip the space. Also name.length to get the full last name
        surname = name.substring(seperation + 1, name.length());
        return surname + " " + forename;
    }

    public static String reverseNameListSplitless(String name)
    {
        ArrayList<String> namesList = new ArrayList<String>();
        //Substring marker to keep track of where the last name ended
        int subStringMarker = 0;
        for(int i = 0; i < name.length(); i++)
        {
            if(name.charAt(i) == ',')
            {
                //Use "reverseSingleNameSplitless" to add the name to the arraylist already reversed
                namesList.add(reverseSingleNameSplitless(name.substring(subStringMarker, i)));
                //i + 2 to skip both the comma and the space.
                subStringMarker = i + 2;
            }//Else if to add final name without a ','. -1 because of indexing.
            else if(i == name.length() - 1)
            {
                //Use "reverseSingleNameSplitless" to add the name to the arraylist already reversed
                namesList.add(reverseSingleNameSplitless(name.substring(subStringMarker, i + 1)));
            }
        }
        //Return the arraylist as a string
        return convertArrayToString(namesList);
    }

    public static String convertArrayToString(ArrayList<String> listToConvert)
    {
        //This function is to seamlessly convert an arraylist to a string, so that it doesn't have a [] bracket at each end
        String result = listToConvert.toString();
        //Remove the end brackets
        return result.substring(1, result.length() - 1);
    }

    public static ArrayList<String> reverseNameListArray(String names)
    {
        //This function is incorrect, as it uses string.split
        String[] seperateNames = names.split(",");
        ArrayList<String> finalNameList = new ArrayList<String>();
        for(int i = 0; i < seperateNames.length; i++)
        {
            String[] individualNames = seperateNames[i].split(" ");
            String reversedName = "";
            for(int j = individualNames.length - 1; j >= 0; j--)
            {
                reversedName += individualNames[j] + " ";
            }
            finalNameList.add(reversedName);
        }

        return finalNameList;
    }

    public static String reverseNameListString(String names)
    {
        //This function is incorrect, as it uses string.split
        String[] seperateNames = names.split(",");
        String reversedNameList = "";
        for(int i = 0; i < seperateNames.length; i++)
        {
            String[] individualNames = seperateNames[i].split(" ");
            String reversedName = "";
            for(int j = individualNames.length - 1; j >= 0; j--)
            {
                reversedName += individualNames[j] + " ";
            }
            reversedNameList += reversedName + ", ";
        }

        StringBuffer finalNameListSB = new StringBuffer(reversedNameList);
        while(finalNameListSB.charAt(finalNameListSB.length() - 1) == ',' || finalNameListSB.charAt(finalNameListSB.length() - 1) == ' ' ) {
            finalNameListSB.deleteCharAt(finalNameListSB.length() - 1);
        }

        return finalNameListSB.toString();
    }
}
