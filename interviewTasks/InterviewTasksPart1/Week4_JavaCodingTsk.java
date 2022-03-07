package InterviewTasksPart1;

import java.util.Arrays;

public class Week4_JavaCodingTsk {
    public static void main(String[] args) {


        System.out.println(frequencyOfChars("AAABBCDD"));

        System.out.println(sameLetters("abx", "xak"));

        System.out.println(removeDup("AAABBBCCC"));
    }

 




    public static String frequencyOfChars(String word1){

        String str ="";
        String result="";
        for (int i = 0; i <word1.length() ; i++) {
            if(str.contains(""+word1.charAt(i))){
                continue;
            }
            str+=word1.charAt(i);
            int frequency =0;
            for (int j = 0; j <word1.length(); j++) {
                if(word1.charAt(i)==word1.charAt(j)){
                    frequency++;
                }
            }

            result += word1.charAt(i)+""+frequency;


        }

        return result;

    }


    public static boolean sameLetters(String str1,String str2){

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }


    public static String removeDup(String str){

        String result ="";

        for (int i = 0; i < str.length() ; i++) {
            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        return result;

    }
}
