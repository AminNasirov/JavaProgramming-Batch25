package day22_MultiDimensionalArray;

public class OddAndEvenNumbers {
    public static void main(String[] args) {


        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };

        int countEven =0;
        int countOdd = 0;

        for (int i = 0; i < arr2D.length; i++) {

            for (int j = 0; j < arr2D[i].length; j++) {
                if(arr2D[i][j]%2==0){
                    countEven++;
                }else{
                    countOdd++;
                }

            }

        }
        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);


    }
}
/*
Write a program that can count the total odd and even numbers from a two dimensional array
 */