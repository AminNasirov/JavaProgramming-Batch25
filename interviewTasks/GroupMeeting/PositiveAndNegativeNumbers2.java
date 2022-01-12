package GroupMeeting;

import java.util.Scanner;

public class PositiveAndNegativeNumbers2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive =0;
        int negative = 0;

        for (int i = 1; i <=5 ; i++) {
            int number = input.nextInt();

            if (number>0){
                positive++;
            }else{
                negative++;
            }

        }
        System.out.println(positive +" positive and " + negative + " negative");
        input.close();

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