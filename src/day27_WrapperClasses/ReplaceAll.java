package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};

        int[] newArr = replaceAll(arr,30,300);

        System.out.println(Arrays.toString(newArr));

    }
    //replaces all the matching old elements of the array with the new element
    public static int[] replaceAll(int[] array, int oldElement, int newElement){


        for (int i = 0; i < array.length; i++) {

            if(array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;

    }

    //replaces all the matching old elements of the array with the new element
    public static double[] replaceAll(double[] array, double oldElement, double newElement){


        for (int i = 0; i < array.length; i++) {

            if(array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;

    }

    //replaces all the matching old elements of the array with the new element
    public static char[] replaceAll(char[] array, char oldElement, char newElement){


        for (int i = 0; i < array.length; i++) {

            if(array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;

    }

    //replaces all the matching old elements of the array with the new element
    public static String[] replaceAll(String[] array, String oldElement, String newElement){


        for (int i = 0; i < array.length; i++) {

            if(array[i].equals(oldElement)){
                array[i]=newElement;
            }
        }
        return array;

    }







}
