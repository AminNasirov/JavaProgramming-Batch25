package practice_12_08_2021;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your number: ");
        int number = scan.nextInt();

        long result =1l;

if(number>0) {
    for (int i = number; i > 0; i--) {
        result *= i;
    }
    System.out.println(number+"! = "+result);
}else{
    System.out.println(number);
}



        scan.close();
    }
}
/* Write a program that can return the factorial number of any given number

                              Ex:
                                  input: 5
                                  output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */