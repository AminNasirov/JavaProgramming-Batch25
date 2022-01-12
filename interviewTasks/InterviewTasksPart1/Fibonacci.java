package InterviewTasksPart1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your digit: ");
        int digit = scan.nextInt();
        scan.close();

        int num1 = 0;
        int num2 = 1;
        int result = 0;

        System.out.print(num1+" ");
        System.out.print(num2+" ");

        for (int i = 2; i < digit ; i++) {
             result = num1+num2;
             num1=num2;
             num2=result;

            System.out.print(result+" ");
        }





    }
}
