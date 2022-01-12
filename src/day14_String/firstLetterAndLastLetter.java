package day14_String;


import java.util.Scanner;

public class firstLetterAndLastLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first word:");
        String word1 = input.nextLine();
        System.out.println("enter second word:");
        String word2 = input.next();
        input.close();

        if(word1.charAt(word1.length()-1)==word2.charAt(0)){
            System.out.println(word1+word2.substring(1));
        }

    }
}
