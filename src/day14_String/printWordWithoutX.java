package day14_String;

import java.util.Scanner;

public class printWordWithoutX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter word below:");
        String word = input.next();

        if(word.indexOf("x")==0){
            System.out.println(word.substring(1));
        }


    }
}
/*
3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */