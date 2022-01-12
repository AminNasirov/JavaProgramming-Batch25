package day05_Concatenation;

/*

Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address

 */


public class shippingAddress {

    public static void main(String[] args) {


           String name = "Amin Nasirov",
                        buildingNumber = "11111A",
                        streetName = "Polo drive",
                        city = "Fairfax",
                        state = "VA",
                        zipCode = "22222B";



/*
                        String name = "Amin Nasirov";
                        String buildingNumber = "11111A";
                        String streetName = "Polo drive";
                        String city = "Fairfax";
                        String state = "VA";
                        String zipCode = "22222B";

 */
       /* System.out.println(name + "\n" + buildingNumber + " "
                + streetName + "\n" + city + ", " + state + " " + zipCode);
        */

String address = name + "\n" + buildingNumber + " " + streetName + "\n"
        + city + ", " + state + " " + zipCode;
        System.out.println(address);

    }
}
