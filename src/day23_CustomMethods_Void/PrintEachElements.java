package day23_CustomMethods_Void;

import java.util.Scanner;

public class PrintEachElements {
    public static void main(String[] args) {

        eachElements();

    }

    public static void eachElements(){
        Scanner scan = new Scanner(System.in);
        System.out.println("length of array");
        int length = scan.nextInt();

        int[]number =new int[length];

        for (int i = 0; i < length ; i++) {
            System.out.println("enter element for array");
            number[i]= scan.nextInt();
        }

        for (int each : number) {
            System.out.print(each+" ");
        }

        scan.close();

    }
}
/*
create a method named printEachElement that can print each elements of an integer array
 */