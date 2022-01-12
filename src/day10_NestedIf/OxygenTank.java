package day10_NestedIf;

public class OxygenTank {
    public static void main(String[] args) {

        int number = 90;

        String result =(number>=50 && number<=90)? (number>=90)? "Your tank is full" :(number>=80)? "Still okay"
                :(number>=70)? "Don't go too far" :(number>=60)? "Start to head back" :"Be careful now you at at 50%"
                :"Invalid Number";

        System.out.println(result);
    }
}
/*
4. Create a class called OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */