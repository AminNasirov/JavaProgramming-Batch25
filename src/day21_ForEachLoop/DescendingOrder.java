package day21_ForEachLoop;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {

        int[] scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores);

        int[] result= new int[scores.length];
             int j=0;
        for (int i = scores.length - 1; i >= 0; i--) {
            result[j++]=scores[i];

        }

        System.out.println(Arrays.toString(result));
    }
}
/*
1. Write a program that sort the array of integer in descending order
 */