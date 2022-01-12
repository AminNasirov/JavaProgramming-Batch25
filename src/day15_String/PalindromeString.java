package day15_String;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();

        String word2 ="";

        for (int i =word.length()-1; i >=0 ; i--) {
            word2+=word.charAt(i);

        }

        boolean isPalindrome = word.equalsIgnoreCase(word2);
        System.out.println(isPalindrome);


    }
}
