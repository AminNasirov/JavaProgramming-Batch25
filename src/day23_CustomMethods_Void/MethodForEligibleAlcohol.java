package day23_CustomMethods_Void;

import java.util.Scanner;

public class MethodForEligibleAlcohol {
    public static void main(String[] args) {
        eligibleForAlcohol();


    }
    public static void eligibleForAlcohol(){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = scan.nextInt();

        if(age>=21) {
            System.out.println("Eligible");
        }else{
            System.err.println("Not Eligible");
        }

    }



}
/*
 create a method that can check if a person is eligible to buy alcohol
 */