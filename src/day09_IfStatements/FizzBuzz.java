package day09_IfStatements;

public class FizzBuzz {
    public static void main(String[] args) {

        int number=15;
        String result;

        if((number%3==0)&&(number%5==0)){
            result="FizzBuzz";
        }else if(number%5==0){
            result="Buzz";
        }else if(number%3==0){
            result="Fizz";
        }else{
            result="No Result";
        }

        System.out.println(result);
    }
}
/*
1. Create a class called FizzBuzz, an integer variable named number is given to you,
write a program that prints "Fizz" if the number is divisible by 3,
 prints "Buzz" if the number is divisible by 5, and prints FizzBuzz
 if the number is divisible by both 3 and 5.

            Ex:
                number 15

            Output:
                FizzBuzz
 */