package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {

        byte grade = 30;

        String result = (grade>=1 && grade<=18)? (grade>=1 && grade<=5)?"Elementary School"
                :(grade>=6 && grade<=8)?"Middle school" :(grade>=9 && grade<=12)? "High school"
                :(grade>=13 && grade<=16)? "College" :"Grad School" : "Invalid grade level given";

        System.out.println(result);


    }
}
/*
1. Create a class called GradeLevel,
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */