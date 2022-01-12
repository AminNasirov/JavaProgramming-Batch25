package day20_Arrays;

import java.util.Arrays;

public class ReverseIntegers {
    public static void main(String[] args) {

        int numbers[]={1,2,3,4,5};
        int numbers1[]=new int[numbers.length];


        for (int i = 0,j=numbers.length; i < numbers.length&&j>0; i++, j--) {
            numbers1[i]=j;

        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers1));
    }
}
/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */