package challenges;

public class LargestPalindromicNumberChecker {
    public static int getLargestPalindromicNumber(int topBound1, int topBound2) {
        int largest = 0;
        //This while loop will go through every number under topbound1 before minusing one from topbound2.
        while(topBound2 > 0)
        {
            for(int i = topBound1; i > 0; i--)
            {
                int potentialInt = i * topBound2;
                //If the resulting number is larger than the largest
                if(potentialInt > largest)
                {
                    //Check if it is palindromic
                    if(reverseInt(potentialInt) == potentialInt)
                    {
                        //If it is palindromic, its the new largest number.
                        largest = potentialInt;
                    }
                }
            }
            //Remove 1 from topBound2 and loop again, should happen 999 times for the test
            topBound2 -= 1;
        }
        //Return the largest number
        return largest;
    }

    private static int reverseInt(int intToReverse) {
        int lastNum = 0;
        int reversedInteger = 0;

        while (intToReverse > 0) {
            //Modulo 10 as that will remove everything from the number but the last digit
            lastNum = intToReverse % 10;
            //Divide inttoreverse by 10 to remove the last digit from it
            intToReverse /= 10;

            //Move the reversedInteger up by 1 by multiplying it by 10, and add on the new last number.
            reversedInteger = (reversedInteger * 10) + lastNum;
        }

        return reversedInteger;
    }
}

