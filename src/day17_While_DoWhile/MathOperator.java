package day17_While_DoWhile;

import java.util.Scanner;
public class MathOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int number1 = scan.nextInt();
        System.out.println("enter second number:");
        int number2 = scan.nextInt();
        System.out.println("enter math operator:");
        char MathOperator = scan.next().charAt(0);

        while (!(MathOperator=='+'||MathOperator=='-'||MathOperator=='*'||MathOperator=='/')){
            System.err.println("invalid operator");
            System.out.println("enter valid math operator:");
             MathOperator = scan.next().charAt(0);
        }
           if(MathOperator=='+'){
               System.out.println(number1+number2);
           }else if(MathOperator=='-'){
               System.out.println(number1-number2);
           }else if(MathOperator=='*'){
               System.out.println(number1*number2);
           }else{
               System.out.println(number1/number2);
           }

           scan.close();

    }
}

/*
3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)

 */