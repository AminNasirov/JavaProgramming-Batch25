package day24_CustomMethods_Return;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {

       String  str1 = "cba";
        String str2 = "bac";

        boolean result1 = isAnagram(str1,str2);

        System.out.println(result1);

    }

    public static boolean isAnagram(String str1,String str2){

        boolean result=false;

char[] ch1 = str1.toCharArray();
char[] ch2 = str2.toCharArray();


        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            result=true;
        }else{
            result=false;
        }

        return result;

        }



    }


/*
create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
 */
