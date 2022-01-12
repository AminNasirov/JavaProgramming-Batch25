package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseTwoDimensionalArray {
    public static void main(String[] args) {


     int[][] array = { {1,2,3}, {4,5,6} };
     int[][] reverse = new int[array.length][array[0].length];

        for (int i = array.length - 1,i1=0; i >= 0; i--,i1++) {
            for (int j = array[i].length - 1,j1=0; j >= 0; j--,j1++) {
                reverse[i1][j1]=array[i][j];
            }
        }

        System.out.println(Arrays.deepToString(reverse));


    }
}
/*
Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};

			output:
			reverse = { {6,5,4}, {3,2,1},};

 */