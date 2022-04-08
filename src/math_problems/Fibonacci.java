package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     * Write a method that will print or return at least 40 Fibonacci numbers
     *
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {
        int highValue =40;
        int firstValue = 0;
        int secondValue = 1;

        System.out.println("Fibonacci of " + highValue +"is :");

        for (int i = 1; i<=highValue; i++){
            System.out.print(firstValue + " ");

            int totalValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue =totalValue;
        }

    }

}
