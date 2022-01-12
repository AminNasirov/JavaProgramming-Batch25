package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter your full name");
        String fullName=input.nextLine();
        System.out.println("enter your building number");
        int buildingNumber =input.nextInt();
        input.nextLine();
        System.out.println("enter your street name");
        String streetName=input.nextLine();
        System.out.println("enter your city name");
        String city = input.nextLine();
        System.out.println("enter your state");
        String state =input.next();
        System.out.println("enter your zip code");
        String zipCode = input.next();
        System.out.println("enter country name");
        input.nextLine();
        String country= input.nextLine();


        System.out.println(fullName+"\n"+buildingNumber+" " +streetName+","
                +city+","+state+"\n"+zipCode+"\n"+country);

        input.close();




    }
}
/*
1. enter your full name
2. enter your building number
3. enter your street name
4. enter your city name
5 enter your state
6 enter your zip code

display the shipping address
 */