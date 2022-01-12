package practice_12_29_2021;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {

    public static void main(String[] args) {


       int[] array = {10, 0, 5, 0, 1, 0};

       int[] array1 = new int[array.length];

       int j=0;

        for (int each: array) {
            if(each!=0){
                array1[j++]=each;
            }
        }

        System.out.println(Arrays.toString(array1));

    }

}
/*
write a program that can mobve all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                {10, 5, 1, 0, 0, 0}
 */