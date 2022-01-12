package practice_12_08_2021;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your word: ");
        String word = scan.next();

        String result = "";


        for (int i =word.length()-1; i >=0 ; i--) {
            result+=word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(result);

        System.out.println(isPalindrome);

scan.close();
    }
}
/*
                       Write a program that can check if the given String is palindrome

                                  Ex:
                                      input:
                                          Level

                                      output:
                                          true


                                      input:
                                          Anna

                                      output:
                                          true

*/