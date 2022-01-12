package day15_String;


import java.util.Scanner;

public class replaceXToA {
    public static void main(String[] args) {


        String word = new Scanner(System.in).next();


        word=word.replaceFirst("x","a");
        System.out.println(word);


    }
}
/*
1. Write a program that asks user to enter a word.
If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */