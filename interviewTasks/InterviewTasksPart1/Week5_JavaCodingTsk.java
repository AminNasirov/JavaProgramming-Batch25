package InterviewTasksPart1;

import java.util.Arrays;

public class Week5_JavaCodingTsk {
    public static void main(String[] args) {


        String str1 = "AAABBBCCCDEF";
        System.out.println(uniqueCharacters(str1));
        System.out.println(reversed(str1));


        String str = "DC501GCCCA098911";

        System.out.println(sortingFromAlphanumericString(str));


    }


    public static String uniqueCharacters(String str){

        String result ="";

        for (int i = 0; i <=str.length()-1 ; i++) {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
               result+=str.charAt(i);
            }
        }
        return result;
    }




    public static String reversed(String str){
        String reversedStr ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedStr+=str.charAt(i);
        }
        return reversedStr;
    }




    

    public static String sortingFromAlphanumericString(String str){
        String str1="";

    for (int i = 0; i <str.length()-1 ; i++) {
        if((Character.isLetter(str.charAt(i))&&Character.isDigit(str.charAt(i+1)))
                ||(Character.isLetter(str.charAt(i+1))&&Character.isDigit(str.charAt(i)))){
            str1+=str.charAt(i)+" ";
        }else{
            str1+=str.charAt(i);
        }
    }
    str1+=str.charAt(str.length()-1);

    String[] array = str1.split(" ");

    String result="";
    for (String each : array) {
      char[] chArray = each.toCharArray();
      Arrays.sort(chArray);
        for (char eachChar : chArray) {
            result+=eachChar;
        }
    }

    return result;
}




}
/*
String -- Sort Letters and Numbers from alphanumeric String
Given alphanumeric String,
 we need to split the string into substrings of consecutive letters or numbers,
 sort the individual string and append them back together
Ex:
Input: "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"

 */