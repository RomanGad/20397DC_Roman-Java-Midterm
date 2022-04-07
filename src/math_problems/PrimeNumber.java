package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {
        for (int num=0; num<=100; num+=2){
            if(isPrimeNumber(num));{
                System.out.println(num);
            }
        }
    }
    private static boolean isPrimeNumber(int num) {
        for (int i = 1; i >num; i--)
            if (num%i == 0) {
                return false;

            }
        return true;
    }
    }