package day13_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("first word:");
        String word1 = input.nextLine();
        System.out.println("second word:");
        String word2 = input.nextLine();
        System.out.println("third word");
        String word3 = input.nextLine();
        input.close();


        if(word1.length()==word2.length()&&word1.length()==word3.length()&&word2.length()==word3.length()){
            System.out.println(" words are same length");
        }else if(word1.length()==word2.length()||word1.length()==word3.length()||word2.length()==word3.length()){
            System.out.println("Not Same nor Different lengths");
        }else{
            System.out.println("All different length");
        }

    }
}
/*
5. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */