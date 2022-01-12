package day19_LoopPractices;

import java.util.Scanner;

public class CalculateAreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pi = 3.14;
        double diameter =0;
        double area = 0;
        double perimeter = 0;

        while (true) {
            System.out.println("Enter the radius of the circle: ");
            double radius = scan.nextDouble();
            if(radius<=0){
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            System.out.println("Diameter of circle");
            diameter=2*radius;
            System.out.println(diameter);
            System.out.println("Area of circle");
            area=pi*radius*radius;
            System.out.println(area);
            System.out.println("Perimeter of circle");
            perimeter=2*pi*radius;
            System.out.println(perimeter);
            System.out.println("Would you like to calculate another circle?");
            String answer = scan.next();
            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.err.println("invalid entry,  re-enter  a valid entry");
                answer = scan.next();
            }
            if(answer.equalsIgnoreCase("no")){
                break;
            }



        }

        System.out.println("Thank you for using Cydeo Circle Calculator APP");



    }
}
/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers,
				terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task


 */