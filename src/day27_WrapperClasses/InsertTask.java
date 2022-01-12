package day27_WrapperClasses;

import java.util.Arrays;

public class InsertTask {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int [] arr1 = insert(arr,2,100);

        System.out.println(Arrays.toString(arr1));


    }

    //Create a method named insert that passes three parameters
    public static int[] insert(int[] array, int index, int element){

        int[] result= new int[array.length+1];
        int i=0;

        for (int j = 0; j < array.length; j++) {
            if(j==index){
                i++;
            }
            result[i++]=array[j];
        }
        result[index]=element;
        return result;
    }


    //Create a method named insert that passes three parameters
    public static double[] insert(double[] array, int index,double element){

        double[] result= new double[array.length+1];
        int i=0;

        for (int j = 0; j < array.length; j++) {
            if(j==index){
                i++;
            }
            result[i++]=array[j];
        }
        result[index]=element;
        return result;
    }

    //Create a method named insert that passes three parameters
    public static char[] insert(char[] array, int index,char element){

       char[] result= new char[array.length+1];
        int i=0;
        for (int j = 0; j < array.length; j++) {
            if(j==index){
                i++;
            }
            result[i++]=array[j];
        }
        result[index]=element;
        return result;
    }

    //Create a method named insert that passes three parameters
    public static String[] insert(String[] array, int index,String element){

        String[] result= new String[array.length+1];
        int i=0;
        for (int j = 0; j < array.length; j++) {
            if(j==index){
                i++;
            }
            result[i++]=array[j];
        }
        result[index]=element;
        return result;
    }



}
/*
 Create a method named insert that passes three parameters: integer array, integer index, integer element.
 the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array

 */