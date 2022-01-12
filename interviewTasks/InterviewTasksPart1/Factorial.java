package InterviewTasksPart1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your digit: ");
        int digit = scan.nextInt();

        int result = 1;


        for (int i = 1; i <=digit ; i++) { //1*

            result*=i;
        }

        System.out.println(result);

        scan.close();

    }
}
