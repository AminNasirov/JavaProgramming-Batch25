package day15_String;

//import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
       // String word= new Scanner(System.in).next();

        String str = "aaabbaacc";
        String result ="";

        for (int i = 0; i <= str.length()-1; i++) {
            String ch = "" + str.charAt(i);

            if (!result.contains(ch)) {  // if the character is not contained in the result
                result += ch;   // character will be added to the result
            }
        }


        System.out.println(result);





    }
}
/*
. Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding
 */