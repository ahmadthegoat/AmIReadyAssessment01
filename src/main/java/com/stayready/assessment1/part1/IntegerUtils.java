package com.stayready.assessment1.part1;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int i;
        int b = 0;
		for(i=0; i < n; i++, b += i );
        return b;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        Integer reversed = 0;
        while(val != 0){
            int digit = val % 10;
            reversed = reversed * 10 + digit;
            val /= 10;
        }
        return reversed;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        Integer declaration = val % 2;
        if (declaration == 0)
            return true;
        else
            return false;
    }
}

