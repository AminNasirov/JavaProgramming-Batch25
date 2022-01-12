package day20_Arrays;

import java.util.Arrays;

public class NameOfMonths {
    public static void main(String[] args) {

        String[] month = {"January","February","March",
                "April","May","June","July","August","September","October","November","December"};

        int number =12;

        System.out.println(Arrays.toString(month));

        if(number<1&&number>12){
            System.err.println("invalid number");
            System.exit(0);
        }

        System.out.println(month[number-1]);
    }
}
