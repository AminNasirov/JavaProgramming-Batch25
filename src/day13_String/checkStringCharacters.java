package day13_String;

import java.util.Scanner;

public class checkStringCharacters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter string:");
        String character = input.nextLine();
        input.close();

        char firstCharacter=character.charAt(0);
        char lastCharacter=character.charAt(character.length()-1);

        if(firstCharacter==lastCharacter){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
    }
}
