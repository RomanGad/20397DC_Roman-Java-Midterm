package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {

        for (int num = 2; num < 100000; num++){
            boolean isPrimeNumber = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) ;{
                    isPrimeNumber = false;
                    break;

                }
            }
            if (isPrimeNumber==true){
                System.out.println(num + " ");
            }
        }
    }


}

