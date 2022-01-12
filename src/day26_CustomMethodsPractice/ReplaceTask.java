package day26_CustomMethodsPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReplaceTask {
    public static void main(String[] args) {

int [] arr = {1,2,3,4,5};

int[] newArr= replace(arr,2,30);

        System.out.println(Arrays.toString(newArr));

    }

    public static int[] replace(int[] arr, int index, int element){

        int[] newArr = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
            if(i==index){
                newArr[i]= element;
            }
        }
        return newArr;
    }
}

/*
Replace Task:
        1.1 Create a method named replace that passes three parameters:
         integer array, integer index, integer newElement.
         The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays


    2. RecplaceAll Task:
 */
