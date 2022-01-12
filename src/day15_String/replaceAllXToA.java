package day15_String;

import java.util.Scanner;

public class replaceAllXToA {
    public static void main(String[] args) {


        String word = new Scanner(System.in).next();


        word=word.replace("x","a").replace("X","a");

        System.out.println(word);

    }
}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */