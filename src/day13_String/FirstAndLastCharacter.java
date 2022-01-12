package day13_String;

import java.util.Scanner;

public class FirstAndLastCharacter {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter sentence:");
        String sentence = input.nextLine();

        input.close();

        char firstCharacter=sentence.charAt(0);
        char lastCharacter =sentence.charAt(sentence.length()-1);
        String result=firstCharacter +"" +lastCharacter;

        System.out.println(result);
    }
}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */
