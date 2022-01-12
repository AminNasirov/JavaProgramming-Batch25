package day15_String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
   //  String name = "Java";
        String name2="" ; // 0+a+v+a+J

        for (int i =name.length()-1; i >=0 ; i--) {
            name2+= name.charAt(i);      // x+=y  x=x+y


        }

        System.out.print(name2);

      //  System.out.println("------------------");

        String str = "Amin"; // 0123

        String str1 = "" + str.charAt(0);// A  char str1 = 'A';

        String str2 = "454464545";



    }

}
