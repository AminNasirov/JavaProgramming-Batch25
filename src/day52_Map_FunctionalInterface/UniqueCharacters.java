package day52_Map_FunctionalInterface;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        Map<String, Integer> result = new LinkedHashMap<>();

        String[] arr = str.split("");

        ArrayList<String> str1 = new ArrayList<>(Arrays.asList(arr));

        for (String each : str1) {
            int frequency = Collections.frequency(str1,each);

            if(frequency==1){
                result.put(each,frequency);
            }
        }

        System.out.println(result);





    }
}
/*
1. Write a program that can find the unique characters from a String

            Ex:
                    str = "aabcccdeeeef";

            output:
                    {b=1, d=1, f=1}
 */