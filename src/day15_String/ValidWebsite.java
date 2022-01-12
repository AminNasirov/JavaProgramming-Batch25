package day15_String;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {
        System.out.println("enter website:");
        String email = new Scanner(System.in).next();

        if(email.startsWith("www.")&&email.endsWith(".com")
                ||email.endsWith(".edu")||email.endsWith(".gov")){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }



    }
}
/*
 2. write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */