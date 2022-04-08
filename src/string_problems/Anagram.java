package string_problems;

import java.util.Arrays;

public class Anagram {

    /*
    Write a Java Program, `isAnagram`, to check if any two strings are anagrams

    An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
    original letters exactly once.

        Ex: "CAT" & "ACT",
            "ARMY" & "MARY",
            "FART" & "RAFT"
    */

    public static void main(String[] args) {
        String name1 ="earth";
        String name2 ="heart";

        if(name1.length() ==name2.length()){

            char [] charArray1 = name1.toCharArray();
            char [] charArray2 = name2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean isAnagram = Arrays.equals(charArray1, charArray2);
            if(isAnagram) {
                System.out.println(name1 +" " + "and" + " " + name2 + " " + "are anagrams. ");
            } else {
                System.out.println(name1 + " " + "and" + " " + name2 + " " + "are not anagrams. ");

            }
        }
    }

}
