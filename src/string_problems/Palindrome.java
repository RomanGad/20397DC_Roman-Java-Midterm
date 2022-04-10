package string_problems;

public class Palindrome {

    /**
      A palindrome is a word that can be reversed, and still remain the same.
      Example: MOM, DAD, MADAM, RACECAR

      Create a method to check if any given String is a palindrome or not.
     */

    // Implement here
    public static void main(String[] args) {
        String palWord = "java";

        String remain = " ";

        int palWordLength= palWord.length();

           for (int i = (palWordLength -1); i>=0; i--)
               remain = remain + palWord.charAt(i);

        if (palWord.equals(remain.toLowerCase())) {
            System.out.println(palWord + " is a palindrome");
        }
        else {
            System.out.println(palWord + " is not a palindrome");

        }
    }



}

