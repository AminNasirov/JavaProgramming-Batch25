package day19_LoopPractices;

public class IndexNumberForFirstUniqueCharacter {
    public static void main(String[] args) {

     String str = "qqwwddaffgttb";
     String result="";

        for (int i = 0; i <str.length() ; i++) {
            int  count = 0;
            char ch1 = str.charAt(i);

            for (int j = 0; j <str.length() ; j++) {
                char ch2 = str.charAt(j);
                if(ch1==ch2){
                    count++;
                }
            }
            if(count==1){
                result+=ch1;
            }
        }

        System.out.println(str.indexOf(result.charAt(0)));


    }
}
/*
 Write a program that can return the index number of the first unique character
 */