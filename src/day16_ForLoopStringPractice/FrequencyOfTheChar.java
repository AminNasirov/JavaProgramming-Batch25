package day16_ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfTheChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter text");
        String str = input.nextLine();
        System.out.println("enter char");
        String ch =input.next();
        input.close();

        int frequency =0;


        for (int i = 0; i <= str.length()-1; i++) {
            if(ch.equalsIgnoreCase(""+str.charAt(i))) {
                frequency++;
            }

        }

        System.out.println(frequency);

    }
}
/*
2. Write a program that asks user to entera string and a char,
the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */