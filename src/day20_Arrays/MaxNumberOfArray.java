package day20_Arrays;

import java.util.Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,50,7,9};
        int max = numbers[0];



        for (int j = 0; j < numbers.length; j++) {
            if(numbers[j]>max){ //if there is element in the array that's greater than the current max number
                max = numbers[j]; // assigning greater number to variable max

            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(max);




    }
}
