package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int [5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter your number: ");
            numbers[i]= scan.nextInt();
        }
        double sum =0;

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(sum/numbers.length);
    }
}
