package practice_12_08_2021.practice_01_05_2022;

import org.w3c.dom.ls.LSOutput;

public class CustomMethodIntro {

    public static void main(String[] args) {


        sum(5,4);

       // sum(5.5,4); Compiler error

        System.out.println(sum1(5,4));

    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static int sum1(int a, int b){
        return a+b;
    }

    public static int sum2(int a, int b){
        return a+b;
    }



}
