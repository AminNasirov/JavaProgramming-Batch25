package day21_ForEachLoop;



public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";

         String[] newSentence = sentence.split(" ");

         String reverse ="";

        for (int i = newSentence.length - 1; i >= 0; i--) {
            reverse+=" "+newSentence[i];
        }

        System.out.println(reverse);




    }
}
/*
Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today
 */