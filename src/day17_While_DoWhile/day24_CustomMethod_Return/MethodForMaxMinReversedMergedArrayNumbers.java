package day17_While_DoWhile.day24_CustomMethod_Return;

import java.util.Arrays;
public class MethodForMaxMinReversedMergedArrayNumbers {
    public static void main(String[] args) {

int[] numbers= {12,45,89,70,40,20};
int[] numbers2={5,4,7};
int maxNumber = max(numbers);
int minNumber= min(numbers);
int[]reversedNumber=reversed(numbers);
int[] mergedNumbers = merge(numbers,numbers2);

        System.out.println(maxNumber);
        System.out.println(minNumber);
        System.out.println(Arrays.toString(reversedNumber));
        System.out.println(Arrays.toString(mergedNumbers));


    }
//create a method that can return the maximum number from an array of integers
    public static int max(int[] array){

        int max=array[0];
        for (int each : array) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }
//create a method that can return the minimum number from an array of integers
public static int min(int[] array){

    int min=array[0];
    for (int each : array) {
        if(each<min){
            min=each;
        }
    }
    return min;
}
//create a method that return the reversed array
public static int[] reversed(int[] array){
int reversed[]=new int[array.length];
    for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
        reversed[j]=array[i];
    }

    return reversed ;
}
//create a method that can merge two arrays and return the new array
    public static int[] merge(int[]array1,int[]array2){

        int[] merged = new int[array1.length+ array2.length];

       int i =0;
        for (int each1 : array1) {
            merged[i++]=each1;
        }
        for (int each2 : array2) {
            merged[i++]=each2;
        }

        return merged;


    }

}


