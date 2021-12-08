package challenges;

import java.util.ArrayList;

public class PrimeFactorGetter {
    public static ArrayList<Integer> getFactors(Integer factorsOfNum) {
        ArrayList<Integer> result = new ArrayList<>();
        //result.add(1);
        //Factors cannot be more than half of the number, start from 2 to not needlessly check 1 or 0.
        for(int i = 2; i <= factorsOfNum / 2; i++)
        {
            //Check if number is a factor of the number provided
            if(factorsOfNum % i == 0)
            {
                //Check if the factor found is a prime number
                if(isPrime(i))
                {
                    result.add(i);
                }
            }
        }
        return result;
    }

    //A version that uses Longs for the number 600851475143 on ProjectEuler
    public static ArrayList<Long> getFactors(Long factorsOfNum) {
        ArrayList<Long> result = new ArrayList<>();
        //result.add(1);
        //Factors cannot be more than half of the number, start from 2 to not needlessly check 1 or 0.
        for(Long i = 2L; i <= factorsOfNum / 2; i++)
        {
            //Check if number is a factor of the number provided
            if(factorsOfNum % i == 0)
            {
                //Check if the factor found is a prime number
                if(isPrime(i))
                {
                    result.add(i);
                }
            }
        }
        return result;
    }

    private static boolean isPrime(int num1) {
        //deal with 1 and 0 seperately here, so as to not divide by 0 or needlessly divide by 1.
        if(num1 <= 1) {
            return false;
        }

        /*
        i = 2 because 1 and 0 are dealt with. Also, i only needs to count up to half of num1 as we are not using decimals,
        and therefore every number that is a factor will be less than half, or the num1 itself.
        */
        for(int i = 2; i <= num1 / 2; i++)
        {
            //Is it a prime number?
            if(num1 % i == 0)
            {
                return false;
            }
        }

        //If the function gets to this point then num1 is a prime number.
        return true;
    }

    private static boolean isPrime(Long num1) {
        //deal with 1 and 0 seperately here, so as to not divide by 0 or needlessly divide by 1.
        if(num1 <= 1) {
            return false;
        }

        /*
        i = 2 because 1 and 0 are dealt with. Also, i only needs to count up to half of num1 as we are not using decimals,
        and therefore every number that is a factor will be less than half, or the num1 itself.
        */
        for(int i = 2; i <= num1 / 2; i++)
        {
            //Is it a prime number?
            if(num1 % i == 0)
            {
                return false;
            }
        }

        //If the function gets to this point then num1 is a prime number.
        return true;
    }
}
