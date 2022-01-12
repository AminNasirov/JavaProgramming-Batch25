package day24_CustomMethods_Return;

import java.util.Arrays;

public class addElement {
    public static void main(String[] args) {

       int[] arr ={1,2,3};
        int num = 4;

        int[] array1 = addElement(arr,num);

        System.out.println(Arrays.toString(array1));


    }
    public static int[] addElement (int[] array, int num){

        int[] result = new int [array.length+1];

        int i = 0;
        for (int each : array) {
            result[i++]=each;
        }
        result[result.length-1]=num;
     return result;

    }

}
/*
create a method named addElement that takes one integer array and one integer,
the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}

 */
