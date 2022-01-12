package day20_Arrays;

import java.util.Arrays;

public class NamesScoresGrades {
    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];


           int num =0;
        for (int i = 0; i < scores.length; i++) {

            if(scores[i]==90){
                grades[num]='A';
            }
            if(scores[i]==80){
                grades[num]='B';
            }
            if(scores[i]==75){
                grades[num]='C';
            }
            num++;
            System.out.println(names[i]+"'s score is "+scores[i]+", and grade is "+grades[i]);

        }

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(grades));

    }
}
/*
4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A

 */