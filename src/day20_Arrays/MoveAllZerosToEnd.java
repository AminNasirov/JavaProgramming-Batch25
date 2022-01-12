package day20_Arrays;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {

        int numbers1[] ={10, 0, 5, 0, 1, 0};
        int numbers2[]= new int[numbers1.length];

          int num = 0;
        for (int i = 0; i < numbers1.length; i++) {
            if(numbers1[i]!=0){
                numbers2[num]=numbers1[i];
                num++;

            }
        }


        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));


    }
}
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */