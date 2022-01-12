package day13_String;

import java.util.Scanner;

public class TheLongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first sentence");
        String sentence1 =input.nextLine();
        System.out.println("enter second sentence");
        String sentence2 =input.nextLine();
        input.close();

        int lengthOfSentence1 = sentence1.length();
        int lengthOfSentence2 =sentence2.length();



        if(lengthOfSentence1!=lengthOfSentence2){

            if(lengthOfSentence1>lengthOfSentence2){
                System.out.println(sentence1);
            }else{
                System.out.println(sentence2);
            }

        }else{
            System.out.println("sentences length are equal");
        }



    }

}
/*
2. write a program that asks user to enter two strings, and print out the longest string
 */