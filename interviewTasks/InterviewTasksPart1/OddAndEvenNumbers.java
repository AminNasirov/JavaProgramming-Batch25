package InterviewTasksPart1;

import java.util.Scanner;

public class OddAndEvenNumbers {
    public static void main(String[] args){

        System.out.println(oddEvenNumbers(10));

    }

    public static String oddEvenNumbers(int number){
        String result ="";
        if(number<=0){
            throw new RuntimeException("invalid number");
        }
        if (number % 2 == 0) {
            result="Even Number";
        } else {
            result="Odd Number";
        }
        return result;
    }
}
