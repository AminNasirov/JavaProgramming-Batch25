package day17_While_DoWhile;

import java.util.Scanner;
public class CalculatesSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("enter number: ");
       int number=0;
        int sum = 0;

        while (number>=0){
            System.out.println("enter number: ");
           number= scan.nextInt();

            if(number<0){
                break;
            }
            sum+=number;

        }

        System.out.println("sum of numbers = "+sum);

        scan.close();

    }
}

/*
2. Write a program that calculates the sum of numbers entered
 by the user until user enters a negative number.
 */