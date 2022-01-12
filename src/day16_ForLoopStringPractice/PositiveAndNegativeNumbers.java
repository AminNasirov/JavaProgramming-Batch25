package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      int positive =0;
      int negative =0;


        for (int i = 1; i <6 ; i++) {
            System.out.println("enter numbers:");
            int number= input.nextInt();

            if(number>0){
                positive+=1;
            }else if(number<0){
                negative+=1;
            }
            
        }
        System.out.println(positive+" positive and "+ negative+ " negative");
        
        
    }
}
/*
1. Write a program that asks user to enter number for 5 times, 
and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */