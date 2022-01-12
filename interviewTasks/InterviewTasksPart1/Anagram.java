package InterviewTasksPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first word: ");
        String word1 = scan.nextLine();
        System.out.println("enter your second word: ");
        String word2 = scan.nextLine();
        scan.close();

        // String[] w1 = word1.split("");
        // String[] w2 = word2.split("");

        char[] w1 = word1.toCharArray();//[e,a,r,t,h]
        char[] w2 = word2.toCharArray(); // [h,e,a,r,t]

        Arrays.sort(w1);
        Arrays.sort(w2);

        if(Arrays.equals(w1,w2)){
            System.out.println("your word are Anagram");
        }else{
            System.err.println("your word are not Anagram");
        }





    }
}
