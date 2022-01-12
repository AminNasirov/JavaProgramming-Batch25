package day16_ForLoopStringPractice;

public class FrequencyWordJava {
    public static void main(String[] args) {

        String sentence = "Java Java";
        String word="Java";
        int num=0;
        for (int i =0 ; i <sentence.length() ; i++) {
            if (sentence.contains(word)){
                sentence=sentence.replaceFirst(word,"");
                num++;

        }

       }

        System.out.println(num);
    }
}
/*
write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create

 */