package day20_Arrays;

import java.util.Scanner;

public class MinAndMaxNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  numbers[]=new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter your number: ");
           numbers[i] = scan.nextInt();

        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }

            if(numbers[i]<min){
                min = numbers[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
