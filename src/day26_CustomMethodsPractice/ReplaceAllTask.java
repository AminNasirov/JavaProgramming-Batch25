package day26_CustomMethodsPractice;

import java.sql.Array;
import java.util.Arrays;

public class ReplaceAllTask {
    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};

        int[] newArr = replaceAll(arr,30,300);

        System.out.println(Arrays.toString(newArr));


    }
    public static int[] replaceAll(int[] arr, int oldNumber, int newNumber){

        int[] newArr = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
            if(arr[i]==oldNumber){
                newArr[i]=newNumber;
            }
        }
        return newArr;
    }


}
/*
RecplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays

 */
