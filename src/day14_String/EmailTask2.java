package day14_String;

import java.util.Locale;
import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter email address:");
        String email = input.next();
        input.close();

        String firstName = email.substring(0,email.indexOf('_'));
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        String lastName = email.substring(email.indexOf('_')+1,email.lastIndexOf('@'));
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        String domain = email.substring(email.lastIndexOf('@')+1,email.lastIndexOf('.'));




        System.out.println("first Name: " + firstName);
        System.out.println("last Name: "  + lastName);
        System.out.println("domain: " + domain);

    }
}
/*
8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */