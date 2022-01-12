package day17_While_DoWhile;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = input.nextInt();
        System.out.println("enter second number:");
        int num2 = input.nextInt();
        input.close();
        int result1=0;
        int result2 =0;

        for (int i = 1; i <= num1; i++) {
            result1+=num2;
        }

        for (int i = num1; i>=num2 ; i-=num2) {
            result2++;
        }

        System.out.println("multiplication");
        System.out.println(result1);
        System.out.println("division");
        System.out.println(result2);

    }
}
/*
Write a program that can divide two numbers
 without using / (division) and * (multiplication) operators
 */