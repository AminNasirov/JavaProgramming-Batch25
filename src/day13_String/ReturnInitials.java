package day13_String;

import java.util.Scanner;

public class ReturnInitials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter 1st String:");
        String sentence1 = input.nextLine();
        System.out.println("enter 2nd String:");
        String sentence2 = input.nextLine();

        input.close();

        sentence1=sentence1.toUpperCase();
        sentence2=sentence2.toUpperCase();

        char firstChSentence1 = sentence1.charAt(0);
        char firstChSentence2 = sentence2.charAt(0);

        System.out.println(firstChSentence1+"."+firstChSentence2);

    }
}
/*
2. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */