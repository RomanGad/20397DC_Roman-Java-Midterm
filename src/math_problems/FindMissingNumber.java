package math_problems;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {
    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static int missingNumber(int[]numbers)
    {
        int n= numbers.length;
        int total = ((n+1)*(n+2))/2;

        for(int i=0; i< n; i++)
            total-=numbers[i];
        return total;
    }
public static void main(String[] args) {

    int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

    int [] mis = array;

    System.out.println(missingNumber((mis)));



        }
        }




