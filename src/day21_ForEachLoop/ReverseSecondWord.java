package day21_ForEachLoop;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String [] sentence1 = sentence.split(" ");

        String reverse ="";

        for (int i = sentence1[1].length()-1; i >=0 ; i--) {
            reverse+=""+sentence1[1].charAt(i);
        }


        sentence=sentence.replaceFirst(sentence1[1],reverse);

        System.out.println(sentence);


    }
}
/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */