package InterviewTasksPart1;

public class Week5_JavaCodingTsk {
    public static void main(String[] args) {



        String str = "AAABBBCCCDEF";
        System.out.println(uniqueCharacters(str));
        System.out.println(reversed(str));


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