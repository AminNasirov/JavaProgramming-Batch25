package day14_String;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter email address:");
        String email = input.next();
        input.close();

        String part1 = email.substring(0,email.indexOf('_'));
        String part2 = email.substring(email.indexOf('_')+1,email.lastIndexOf('@'));
        String part3 = email.substring(email.lastIndexOf('@'));

        System.out.println(part2+"_"+part1+part3);

    }
}
/*
Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */