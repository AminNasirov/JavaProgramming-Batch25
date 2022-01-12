package day12_Scanner;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your gender");
        String gender = input.next();
        input.nextLine();
        System.out.println("enter your full name");
        String fullName = input.nextLine();
        System.out.println("Enter your phone number");
        long phoneNumber = input.nextLong();
        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();
        input.nextLine();
        System.out.println("enter your school name");
        String schoolName = input.nextLine();
        System.out.println("enter your city");
        String city = input.nextLine();
        System.out.println("enter your state");
        String state = input.nextLine();
        System.out.println("enter your building number");
        int buildingNumber = input.nextInt();
        input.nextLine();
        System.out.println("enter your street name");
        String streetName = input.nextLine();
        input.close();


        System.out.println("full Name: " + fullName);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
        System.out.println("phone Number: " + phoneNumber);
        System.out.println("address: \n\t" + buildingNumber+" "+streetName+ "\n\t"+city+
                ", "+state+" "+zipCode);
        System.out.println("school Name: " + schoolName);


    }
}
