package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        int[] newArr= replace(arr,2,30);

        System.out.println(Arrays.toString(newArr));

        System.out.println("--------------------------------");

        String[] arr2={"Amin", "Farid","Ali", "Hasan"};

        String[] newArr2 = replace(arr2, 2,"Mamed");

        System.out.println(Arrays.toString(newArr2));



    }
    //Create a method named replace that passes three parameters:integer array, integer index, integer newElement.
    public static int[] replace(int[] arr, int index, int element){

        if (index<0 || index>arr.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        arr[index]=element;
        return arr;
    }

    //Create a method named replace that passes three parameters:double array, integer index, double newElement.
    public static double[] replace(double[] arr, int index, double element){

        if (index<0 || index>arr.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        arr[index]=element;
        return arr;
    }

    //Create a method named replace that passes three parameters:char array, integer index, char newElement.
    public static char[] replace(char[] arr, int index, char element){

        if (index<0 || index>arr.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        arr[index]=element;
        return arr;
    }

    //Create a method named replace that passes three parameters:String array, integer index, String newElement.
    public static String[] replace(String[] arr, int index, String element){

        if (index<0 || index>arr.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        arr[index]=element;
        return arr;
    }

}
