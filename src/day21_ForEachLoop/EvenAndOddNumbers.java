package day21_ForEachLoop;

import java.util.Arrays;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        int[] scores = {95, 100, 55, 65, 85, 78};
int countOdd=0;
int countEven=0;
        for (int each : scores) {
            if(each%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println(Arrays.toString(scores));
        System.out.println("Even numbers = " + countEven);
        System.out.println("Odd numbers = " + countOdd);





    }
}
/*
Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */