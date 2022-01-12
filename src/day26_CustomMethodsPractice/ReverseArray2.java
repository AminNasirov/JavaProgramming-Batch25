package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        int[] result = reverse(arr);

        System.out.println(Arrays.toString(result));


    }
    // reverses the array, returns new array
    public static int[] reverse(int[] array){
        int[] result= {};

        for (int i = array.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }

    // reverses the array, returns new array
    public static double[] reverse(double[] array){
        double[] result= {};

        for (int i = array.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }

    // reverses the array, returns new array
    public static char[] reverse(char[] array){
        char[] result= {};

        for (int i = array.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }

    // reverses the array, returns new array
    public static String[] reverse(String[] array){
        String[] result= {};

        for (int i = array.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }



}
