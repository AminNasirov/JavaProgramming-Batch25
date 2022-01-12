package day15_String;

import java.util.Scanner;

public class SumOfAllNumbersGiven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number:");
        int number = input.nextInt();

        int sum=0;

        for (int i = 1; i <=number ; i++) {
            sum+=i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(sum);

        input.close();

    }
}
