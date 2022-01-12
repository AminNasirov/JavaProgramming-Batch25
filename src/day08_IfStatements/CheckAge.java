package day08_IfStatements;
/*
1. Given a number (byte) age,
write a program that can check if the person is eligible to buy Cigarettes
 */

public class CheckAge {
    public static void main(String[] args) {

        byte age = 23;

        boolean isEligible = age>=21;

        if(isEligible){
            System.out.println("Eligible");

        } else{
            System.out.println("not Eligible");
        }



       /*
       if(!isEligible){
            System.out.println("not Eligible");


        }

        */



    }
}
