package day11_Switch_Scanner;

import java.util.Scanner;

public class AgeGroupOfThePerson {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int age = input.nextInt();

        String result ="";

        switch (age){
            case 1: case 2:
                result="Infant";
                break;
            case 3: case 4: case 5:
                result="Toddler";
                break;
            case 6: case 7: case 8: case 9:
                result="Kid";
                break;
            case 10: case 11: case 12:
                result="Pre-Teen";

        }

    }
}
/*
6. write a program that can define the age groups of a person
                 age groups are:
                        infant ( 1 - 2 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

                NOTE: MUST USE switch statement
 */
