package core;

public class BinarySearch {
    public static int binarySearch(int[] sortedList, int itemToFind)
    {
        //Has the correct integer been found?
        boolean found = false;
        //Get the halfway point, start and end. End is plus one because max will never be hit.
        int seperatorIndex = 0, min = 0, max = (sortedList.length - 1) + 1;

        //Set the max attempts with the O notation value (Plus casting in this little mess, obligatory instructor annoyer)
        //Max attempts will be used to know when it has failed to find the item.
        int maxAttempts = (int)Math.round(Math.log(sortedList.length));
        //Track the attempts tried
        int attemptsTried = 0;
        //While not found
        while (!found) {
            //  --  Find it  --
            //Set the seperatorIndex to the middle of the list
            seperatorIndex = Math.round(((max - min) / 2) + min);

            //Grab the current number selected here rather than in every if statement
            int currentNum = sortedList[seperatorIndex];
            //Check the item at seperatorIndex's position
            if(currentNum == itemToFind)
            {
                //If found return its location/index
                return seperatorIndex;
            }
            else if(currentNum > itemToFind)
            {
                //if its too high then move the max down
                max = seperatorIndex;
            }
            else
            {
                //If its too low then move the min up
                min = seperatorIndex;
            }
            //Little sout for checking the number of attempts
            //System.out.println(attemptsTried);
            //If the max number of attempts has passed then fail.
            if(attemptsTried > maxAttempts)
            {
                //Return -1 to symbolise failure
                return -1;
            }
            else
            {
                //Else just tick up the attempts.
                attemptsTried += 1;
            }
            System.out.println(max);
        }
        //Return the location
        return seperatorIndex;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{7, 9, 100, 1250, 1900, 2000, 2100, 2500, 789123, 18927491},  18927491));
    }
}
