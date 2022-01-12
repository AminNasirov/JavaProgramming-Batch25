package day13_String;

import java.util.Scanner;

public class CompareStringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a String:");
        String result = input.next();
        input.close();




       if(result.length()==0) {
            System.out.println("String is empty");
        }else if (result.length() > 3) {
           System.out.println(result.charAt(result.length()-3) +""
                   + result.charAt(result.length()-2) + result.charAt(result.length()-1));
            } else {
                System.out.println(result);
            }


    }
}
/*
3. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */