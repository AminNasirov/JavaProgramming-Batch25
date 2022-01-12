package day15_String;

import java.util.Scanner;

public class ReversString2 {
    public static void main(String[] args) {
        String word = new Scanner(System.in).nextLine();
        String word2="";

        for (int i =word.length()-1; i >=0 ; i--) {
            word2+=word.charAt(i);


        }
        System.out.print(word2);

    }
}
