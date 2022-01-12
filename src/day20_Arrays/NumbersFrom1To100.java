package day20_Arrays;

import java.util.Arrays;

public class NumbersFrom1To100 {
    public static void main(String[] args) {

        int[] numbers = new int[100];

        for (int i = 0,j=1; i <=numbers.length-1 && j<=100 ; i++, j++) {
            numbers[i]=j;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("-----------------------------------------------");
        int[] numbers1 = new int[100];

        for (int i = 0, j=100; i <=numbers1.length-1 && j>=1 ; i++,j--) {
            numbers1[i]=j;

        }
        System.out.println(Arrays.toString(numbers1));
        System.out.println("-----------------------------------------------");


        int[] numbers2 = new int[10];

        for (int i = 0; i <=numbers2.length-1 ; i++) {
            numbers2[i]=10;

        }
        System.out.println(Arrays.toString(numbers2));
        System.out.println("-----------------------------------------------");


    }
}
