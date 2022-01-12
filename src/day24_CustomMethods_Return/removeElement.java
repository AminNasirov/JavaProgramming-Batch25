package day24_CustomMethods_Return;

import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {

      int[]  array = {10, 20, 30, 40, 50, 60};
        int index = 2;

        int[] result = removeElement(array,index);

        System.out.println(Arrays.toString(result));


    }
    public static int[] removeElement(int[] array, int index){

        int[] newArray= new int[array.length-1];

        int j=0;

        for (int i = 0; i < array.length; i++) {
            if(i==index){
                continue;
            }
            newArray[j++]=array[i];
        }

        return newArray;
    }

}
/*
create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}

 */
