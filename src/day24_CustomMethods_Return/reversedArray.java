package day24_CustomMethods_Return;

import java.util.Arrays;

public class reversedArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int [] result = reversedArray(arr);

        System.out.println(Arrays.toString(result));


    }
    public static int[] reversedArray(int[] array){

        int[] reversed = new int [array.length];


        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
        reversed[j]=array[i];
        }

        return reversed;
    }

}
/*
Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
 */
