package InterviewTasksPart1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your word: ");
        String word = scan.next();

        String reversed = ""; //level
        boolean result=false;

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed+=word.charAt(i);
        }

        if (word.equalsIgnoreCase(reversed)){
           result=true;
        }

        System.out.println(result);

        scan.close();
    }
}
