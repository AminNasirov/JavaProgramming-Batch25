package InterviewTasksPart1;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your word: ");
        String word = scan.next();

        String result ="";

        for (int i =word.length()-1; i >=0 ; i--) {
            result+=word.charAt(i);
        }

        System.out.println(result);
        scan.close();



    }
}
