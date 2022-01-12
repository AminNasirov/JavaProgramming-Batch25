package day16_ForLoopStringPractice;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your sentence: ");
        String sentence = input.nextLine();
        input.close();

        String word1 = "cat";
        String word2 = "dog";
        int cat = 0;
        int dog = 0;
        boolean result = true;

        sentence =sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.contains(word1)){
                sentence=sentence.replaceFirst(word1,"");
                cat++;
            }
            if(sentence.contains(word2)){
                sentence=sentence.replaceFirst(word2,"");
                dog++;
            }

        }

        if(cat==dog){
            System.out.println(result);
        }else
            System.out.println(!result);



    }
}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */