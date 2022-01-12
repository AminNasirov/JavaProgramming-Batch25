package day19_LoopPractices;

public class FirstDuplicateCharacter {
    public static void main(String[] args) {

        String word = "assdderttggg";
        String result = "";

        for (int i = 0; i <word.length() ; i++) {
            int count =0;
            char ch1 = word.charAt(i);

            for (int j = 0; j <word.length() ; j++) {
                char ch2 = word.charAt(j);
                if(ch1==ch2){
                    count++;
                }
            }
            if(count>1){
                result+=ch1;
            }
        }

        System.out.println(result.substring(0,1));
    }
}
/*
1. Write a program that can return the first duplicated character from a string
 */