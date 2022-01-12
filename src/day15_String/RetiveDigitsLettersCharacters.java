package day15_String;

import java.util.Scanner;

public class RetiveDigitsLettersCharacters {
    public static void main(String[] args) {
        System.out.println("enter word:");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        input.close();

        String letters = "";
        String digits ="";
        String ch="";


        for (char i = 0; i <=word.length()-1 ; i++) {

            if((word.charAt(i)>='A'&&word.charAt(i)<='Z')||(word.charAt(i)>='a'&&word.charAt(i)<='z')){
                letters+= word.charAt(i);
            }else if(word.charAt(i)>='0'&&word.charAt(i)<='9'){
                digits+=word.charAt(i);
            }else{
                if(word.charAt(i)!=' '){ // if ch not include space character


                ch+=word.charAt(i);
                }
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("ch = " + ch);




    }
}
/*
5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */