package day07_Operators;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;
        boolean isDivisible2 = number % 2 ==0,
                isDivisible3 = number % 3 ==0,
                isDivisible5 = number % 5 ==0;

        System.out.println(number + " is divisible by 2: " + isDivisible2);
        System.out.println(number + " is divisible by 3: " + isDivisible3);
        System.out.println(number + " is divisible by 5: " + isDivisible5);



    }
}
/*
2. Create a class called EvenlyDivisible,
 and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
 */