package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while(true) {
            System.out.println("enter your number: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }

            System.out.println("Would you like to enter another number");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("invalid answer, please re-neter again: ");
                answer = scan.next().toLowerCase();
            }

            if(answer.equals("no")){
                break;
            }
        }

        scan.close();



    }
}
/*
2. Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"
        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing
                If user enters invalid answer, repeat the previous steps
 */