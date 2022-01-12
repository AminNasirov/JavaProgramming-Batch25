package InterviewTasksPart1;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        int[] reverseArray = new int [array.length];

       // int j = 0;
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reverseArray[j]=array[i];




        }

        System.out.println(Arrays.toString(reverseArray));

    }

}
