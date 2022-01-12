package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 ="adbc";
        String str2 ="dacb";

        char[]chStr1 =str1.toCharArray();
        char[]chStr2 =str2.toCharArray();

        System.out.println(Arrays.toString(chStr1));
        System.out.println(Arrays.toString(chStr2));

        Arrays.sort(chStr1);
        Arrays.sort(chStr2);

        System.out.println("----------------------");

        System.out.println(Arrays.toString(chStr1));
        System.out.println(Arrays.toString(chStr2));

        System.out.println("----------------------");

        boolean result = Arrays.equals(chStr1,chStr2);

        System.out.println(result);


    }
}
