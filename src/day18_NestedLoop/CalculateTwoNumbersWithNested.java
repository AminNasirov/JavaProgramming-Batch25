package day18_NestedLoop;

import java.util.Scanner;

public class CalculateTwoNumbersWithNested {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double result = 0;

        while (true) {
            System.out.println("enter the first number: ");
            int num1 = scan.nextInt();
            scan.nextLine();
            System.out.println("enter a math operator: ");
            char chr = scan.nextLine().charAt(0);
            while (!((chr=='+')||(chr=='-')||(chr=='*')||(chr =='/'))){
                System.err.println("invalid operator, re-enter valid operator: ");
                chr = scan.nextLine().charAt(0);
            }
            System.out.println("enter second number: ");
            int num2 = scan.nextInt();
            if(chr=='+'){
                result=(num1+num2);
            }
            if(chr=='-'){
                result=(num1-num2);
            }
            if(chr=='*'){
                result=(num1*num2);
            }
            if(chr=='/'){
                result=(num1/num2);
            }
            System.out.println("result = "+result);
            scan.nextLine();
            System.out.println("Do you want to continue? (yes/no): ");
            String answer = scan.nextLine().toLowerCase();
            while(!(answer.equals("yes")||answer.equals("no"))){
                System.err.println("invalid entry, re-enter valid entry");
                answer = scan.nextLine().toLowerCase();
            }
            if(answer.equals("no")){
                break;
            }

        }
        System.out.println("Thanks for using Cydeo calculator!");

    }
}
/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */