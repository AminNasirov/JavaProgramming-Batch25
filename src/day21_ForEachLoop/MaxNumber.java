package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 4, 20, 1, 0,40};
                //        0  1   2  3  4  5  6


        ;// 20

/*
        for (int i = 0; i <= numbers.equals-1; i++) {
            if(numbers[i] > max ){ // if there is element in the array that's greater than the current max number
                max = numbers[i]; // assigning greater number to variable max
            }
        }
 */
        int max = numbers[0];//20,40
        for (int eachElement : numbers) {


            if(eachElement > max){
                max =eachElement;
            }



        }


        System.out.println(max);

    }
}
