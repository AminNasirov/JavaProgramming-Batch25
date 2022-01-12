package InterviewTasksPart1;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your digit for Fibonacci: ");
        int digit = scan.nextInt();
        scan.close();

        int[] numbers = new int[digit];

        numbers[0]=0;
        numbers[1]=1;

        for (int i = 2; i <digit; i++) {
            numbers[i]= numbers[i-1]+numbers[i-2];//1 +1 =2
        }  // numbers[6]=numbers[5]+numbers[4]   5+3=8

        System.out.println(Arrays.toString(numbers));
    }
}
