package InterviewTasksPart1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Week7_JavaCodingTsk {
    public static void main(String[] args) {

        int [] arr = {10,9,8,7};
        sortAscending(arr);

        int[] arr1 = {10,20,7,8,90};
        sortDescending(arr1);

        int[] arr2 = {10,20,7,8,90};

        int minNum = findMinimum(arr2);

        System.out.println("minNum = " + minNum);

        ArrayList<String> nums = new ArrayList<>();
        nums.addAll(Arrays.asList("10","20","60","40","15"));

        sortAscending(nums);


    }

    public static void sortAscending(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                int num = 0;
                if(arr[i]<arr[j]){
                   num=arr[i];
                    arr[i]=arr[j];
                    arr[j]=num;
                }

            }
        }

        System.out.println(Arrays.toString(arr));

    }


    public static void sortDescending(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                int num = 0;
                if(arr[i]>arr[j]){
                    num=arr[i];
                    arr[i]=arr[j];
                    arr[j]=num;
                }

            }
        }

        System.out.println(Arrays.toString(arr));

    }


    public static int findMinimum(int[] nums){
        int number = nums[0];

        for (int each : nums) {
            if(each<number){
                number=each;
            }
        }
        return number;
    }

    public static void sortAscending(ArrayList<String> nums){

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i1 = 0; i1 < nums.size(); i1++) {
            integers.add(Integer.parseInt(nums.get(i1)));
        }

        //  Collections.sort(integers);

        for (int i = 0; i < integers.size(); i++) {

            for (int j =0; j <integers.size() ; j++) {

               Integer num = Integer.MAX_VALUE;

                if(integers.get(i)<integers.get(j)){
                    num=integers.get(i);
                 integers.set(i,integers.get(j));
                 integers.set(j,num);
                }

            }
        }
        System.out.println(integers);



    }














}
