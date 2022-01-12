package GroupMeeting;

import java.util.Scanner;

public class FrequencyOfTheChar2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str = input.nextLine();
        String ch = input.next();
        input.close();

        int num=0;


        for (int i = 0; i < str.length(); i++) {//012345678
            if(ch.equalsIgnoreCase("" + str.charAt(i))){
                num+=1;


            }

        }
        System.out.println(num);
    }
}
/*
2. Write a program that asks user to enter string and a char,
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