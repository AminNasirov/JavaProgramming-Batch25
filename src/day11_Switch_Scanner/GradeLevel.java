package day11_Switch_Scanner;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Grade Level: ");

        byte number =input.nextByte();

        //Solution 1: Use switch statement

        String result ;

        switch (number){
            case 1: case 2: case 3: case 4: case 5:
                result="Elementary School";
                break;
            case 6: case 7: case 8:
                result="Middle school";
                break;
            case 9: case 10: case 11: case 12:
                result ="High School";
                break;
            case 13: case 14: case 15: case 16:
                result="College";
                break;
            case 17: case 18:
                result= "Grad School";
                break;
            default:
                result="Invalid grade";

        }

        System.out.println(result);

        System.out.println("--------------------------------");

        //Solution 2: use if & switch both

        String result2;

        if(number>=1 && number<=18){

            switch (number){
                case 1: case 2: case 3: case 4: case 5:
                    result2="Elementary School";
                    break;
                case 6: case 7: case 8:
                    result2="Middle school";
                    break;
                case 9: case 10: case 11: case 12:
                    result2 ="High School";
                    break;
                case 13: case 14: case 15: case 16:
                    result2="College";
                    break;
                default:
                    result2="Grad School";
            }

        }else{
            result2="Invalid Grade";
        }

        System.out.println(result2);

        input.close();


    }
}
