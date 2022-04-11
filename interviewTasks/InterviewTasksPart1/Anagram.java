package InterviewTasksPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        String str1= "heart";
        String str2 = "earth";

        Anagram(str1,str2);

        String name = "Level";

        Anagram1(name);


    }

    public static void Anagram(String str1, String str2){


        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();



        Arrays.sort(arr1);
        Arrays.sort(arr2);


        boolean result = true;

        if(Arrays.equals(arr1,arr2)){
            result=true;
        }else{
            result=false;
        }

        System.out.println(result);




    }


    public static void Anagram1(String str3){

        String reversed ="";

        for (int i = str3.length()-1; i >=0 ; i--) {
            reversed+=str3.charAt(i);
        }

        if(str3.equalsIgnoreCase(reversed)){
            System.out.println("it is Anagram");
        }else{
            System.err.println("it is not Anagram");
        }


    }




}
