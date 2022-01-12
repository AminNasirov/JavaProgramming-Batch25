package day15_String;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("enter number:");
        int number = new Scanner(System.in).nextInt();

        int factorial = 1;

        for (int i = number; i>=1 ; i--) {
            factorial*=i;
            System.out.print(i+" ");

        }

        System.out.println();
        System.out.println(factorial);


    }
}
