package day27_WrapperClasses;

import java.util.Arrays;

public class SwapTask {
    public static void main(String[] args) {

int[] arr = {10, 20, 30, 40, 50};

int[] arr1 = swap(arr,2,4);

        System.out.println(Arrays.toString(arr1));


    }


//Create a method named swap that passes three parameters
 public  static  int[] swap(int[] array, int i, int j){
         int num = array[i];
         array[i]=array[j];
         array[j] = num;

         return array;
 }
//Create a method named swap that passes three parameters
    public  static  double[] swap(double[] array, int i, int j){
        double num = array[i];
        array[i]=array[j];
        array[j] = num;

        return array;
    }

    //Create a method named swap that passes three parameters
    public  static  char[] swap(char[] array, int i, int j) {
        char num = array[i];
        array[i] = array[j];
        array[j] = num;

        return array;

    }

    //Create a method named swap that passes three parameters
    public  static  String[] swap(String[] array, int i, int j) {
        String num = array[i];
        array[i] = array[j];
        array[j] = num;

        return array;

    }





    }
/*
2.1 Create a method named swap that passes three parameters:
 integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array

 */