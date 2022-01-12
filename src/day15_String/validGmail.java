package day15_String;

import java.util.Scanner;

public class validGmail {
    public static void main(String[] args) {
        System.out.println("enter email:");
        String email = new Scanner(System.in).next();

        if(email.endsWith("@gmail.com")){
            System.out.println(email);
        }else{
            System.out.println("Invalid");
        }


    }
}
/*
1. write a program to verify if the gmail is valid
            requirements:
                    a valid gmail account should end with @gmail.com
 */