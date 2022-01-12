package GroupMeeting;

import java.util.Scanner;

public class UniqueCharacters2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String word = input.nextLine();
        input.close();

        String word1 ="";

        for (int i = 0; i < word.length() ; i++) {
            if(word.indexOf(word.charAt(i))==word.lastIndexOf(word.charAt(i))){
                word1+=word.charAt(i);
            }

        }
        System.out.println(word1);

    }
}
/*
2. Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */