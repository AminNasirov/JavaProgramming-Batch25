package day22_MultiDimensionalArray;



public class MinAndMaxNumbers {
    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };

              int max=0;
              int min=10;
        for (int i = 0; i < arr2D.length; i++) {
            //  System.out.println(Arrays.toString(arr2D[i]));
            int max1 = 0;
            int min1 = 10;
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] > max1) {
                    max1 = arr2D[i][j];
                }
                if (arr2D[i][j] < min1) {
                    min1 = arr2D[i][j];
                }
            }
            if (max1 > max) {
                max = max1;
            }
            if (min1 < min) {
                min = min1;

            }
        }
            System.out.println("min = " + min);
            System.out.println("max = " + max);

    }
}
/*
Write a program that can find the minimum and maximum numbers from a two dimensional array
 */