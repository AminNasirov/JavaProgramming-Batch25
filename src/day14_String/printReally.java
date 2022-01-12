package day14_String;

import java.util.Scanner;

public class printReally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter word:");
        String word = input.next();
        input.close();

       char ch1= word.charAt(word.length()-1);
       char ch2= word.charAt(word.length()-2);

       if(ch1=='y'&&ch2=='l'){
           System.out.println("Really???");
       }else{
           System.out.println("never mind");
       }


    }
}
/*
 2. ask the user to enter a word.
 if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

 */