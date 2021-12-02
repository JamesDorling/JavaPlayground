package challenges.week_1;

import java.util.Scanner;

public class Challenge3 {
    public static int neededFlips(int[] coins)
    {
        //Predefine the coin flips and outcomes
        int flips = 0, heads = 0, tails = 0;

        //If the number of coins to be flipped is not even then dont even try
        if(coins.length % 2 != 0)
        {
            System.out.println("Not a multiple of 2!");
            return 0;
        }

        //For loop goes through outcomes and records them to variables
        for (int i = 0; i < coins.length; i++)
        {
            //If the coin is a heads then add one to heads, and vice versa
            if (coins[i] == 1)
            {
                heads += 1;
            }
            else
            {
                tails += 1;
            }
        }

        /*
        This code checks which one is larger, and gets the difference / 2 to say how many coins would need to be flipped
        to make them even. This needs to half the distance, as every time you remove one from one side it is added to
        the other side. This is also rounded just in case.
         */
        if(heads != tails) {
            if (heads > tails) {
                flips = Math.round((heads - tails) / 2);
            } else {
                flips = Math.round((tails - heads) / 2);
            }
        }

        return flips;
    }
    public static int[] takeInputs()
    {
        Scanner scan = new Scanner(System.in); //Decided to make the coin outcomes an input

        int[] coins = new int[getListSize(scan)]; //Set the list size
        System.out.println("Please input outcome of each coin flip, 1 for heads 0 for tails. One per line. Put any number other than a 1 or a 0 to go back by one.");

        //Take the amount of inputs necessary to fill the list
        for (int i = 0; i < coins.length; i++)
        {
            try
            {
                //Scan for an integer. If it is not an integer it will throw an error.
                coins[i] = scan.nextInt();
                if((coins[i] != 0 )& (coins[i] != 1))
                {
                    System.out.println("Going back by one.");
                    coins[i] = 0;
                    i = i - 2;
                    if(i < 0)
                    {
                        i = 0;
                    }
                }
            }//Catch any errors, tried to make the scanner be able to take letters as well. I broke it. May try again later.
            catch (Exception e)
            {
                coins[i] = 0;

            }

        }
        return coins;
    }

    public static int getListSize(Scanner scanner)
    {
        System.out.println("How many times have you flipped a coin?"); //Ask this question so that people know to input
        //The listsize must be input as lists are not like arraylists where there is an easy add function.
        return scanner.nextInt(); //Return the list size
    }
}
