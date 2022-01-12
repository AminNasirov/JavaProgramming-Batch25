package day15_String;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();

        String UniqueCh ="";

        for (int i = 0; i <=word.length()-1 ; i++) {
            if(word.indexOf(word.charAt(i))==word.lastIndexOf(word.charAt(i))){
                UniqueCh+=word.charAt(i);
            }

        }
        System.out.println(UniqueCh);


    }
}
/*
2. Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */