package GroupMeeting;

import java.util.Scanner;

public class RemoveDuplicate2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        input.close();

        String ch = "";

        for (int i = 0; i < word.length(); i++) {
            String str = ""+word.charAt(i);

            if (!ch.contains(str)) {
                ch += str;
            }

        }
        System.out.println(ch);
    }

    }

/*
. Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding
 */