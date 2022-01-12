package day14_String;

import java.util.Scanner;

public class AppleAndBanana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first word:");
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        input.close();


        word1=word1.substring(1);//1,2
        word2=word2.substring(1);

        System.out.println(word1+word2);


    }
}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    01234
                    banana
                Output:
                    ppleanana
 */