package GroupMeeting;


import java.util.Scanner;

public class TwoPositiveNumbers2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        input.close();

        int result = 0;


        if(number1>0&&number2>0){
            for (int i = 1; i <=number1 ; i++) {
                result+=number2;

            }
        }

        System.out.println(result);

    }
}
/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
 */