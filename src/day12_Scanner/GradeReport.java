package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter your score here");

        int score =input.nextInt();

        String grade ;



        System.out.println("score = " + score);

        if(score>=0 && score<=100){

            if(score>=95){
                grade="A";
            }else if(score>=85){
                grade="B";
            }else if(score>=75){
                grade="C";
            }else if(score>=65){
                grade ="D";
            }else{
                grade="F";
            }


        }else{
            grade="invalid score";

        }

        System.out.println("grade = " + grade);

        input.close();



    }
}
/*
2. GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */