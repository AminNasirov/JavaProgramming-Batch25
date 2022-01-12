package day19_LoopPractices;

public class AppearedTwiceCharacters {
    public static void main(String[] args) {

       String str = "qqwwddaffgttb";
       String result="";

        for (int i = 0; i < str.length(); i++) {
            int count =0;
            char ch1 = str.charAt(i);

            for (int j = 0; j <str.length() ; j++) {
                char ch2 = str.charAt(j);
                if(ch1==ch2){
                    count++;
                }
            }

            if(count==2){
                result+=ch1;
            }


        }

        System.out.println(result);


    }
}
/*
Write a program that can display all the characters that appeared twice in the string.
 */