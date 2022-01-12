package day09_IfStatements;

/*
1. Create a class called MinNumber,
Write a program that can print the minimum number between two numbers,
if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number
 */
public class MinNumber {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        boolean isMinNumber1 =  n2<n1;
        boolean isMinNumber2 = n1<n2;
        boolean isEqualNumber = n2==n1;

        if(isMinNumber1){
            System.out.println(n2 + " is a minimum number");
        }

        if(isMinNumber2){
            System.out.println(n1 + " is a minimum number");
        }
        if(isEqualNumber){
            System.out.println("Equal");
        }



    }
}
