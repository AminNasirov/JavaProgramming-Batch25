package day18_NestedLoop;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = scan.next();
        String ch = "";

        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            if(ch.contains(""+ str.charAt(i))){
                continue;
            }
            ch+=str.charAt(i);
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(str.charAt(i));
            }
        }
        scan.close();

    }
}

/*
 Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique

 */