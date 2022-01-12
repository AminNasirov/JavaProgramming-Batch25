package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {1,2,1,2,3,4,5,6,6,7};

        int[] result = removeDuplicates(arr1);

        System.out.println(Arrays.toString(result));


    }
    // remove duplicate elements from array and returns new array
    public static int[] removeDuplicates(int[] array){
        int[] result = {};

        for (int each : array) {
            if(!(ArraysUtility.contains(result,each))){
               result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // remove duplicate elements from array and returns new array
    public static double[] removeDuplicates(double[] array){
        double[] result = {};

        for (double each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // remove duplicate elements from array and returns new array
    public static char[] removeDuplicates(char[] array){
        char[] result = {};

        for (char each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result= ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }

    // remove duplicate elements from array and returns new array
    public static String[] removeDuplicates(String[] array){
        String[] result = {};

        for (String each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result= ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }



}
