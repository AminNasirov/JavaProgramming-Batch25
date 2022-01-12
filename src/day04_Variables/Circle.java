package day04_Variables;

/*

3. Create a class named Circle,
 write a program that can calculate the area & perimeter of any given Circle

 */

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");


        double radius = scan.nextDouble();

        double PI = 3.14;
        double diameter = 2 * radius;
        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("PI = " + PI);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        scan.close();
    }
}
