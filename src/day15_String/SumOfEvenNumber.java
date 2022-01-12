package day15_String;

public class SumOfEvenNumber {
    public static void main(String[] args) {

        int sum=0;

        for (int i = 2; i <=100 ; i+=2) {
            sum+=i;
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println(sum);

    }
}
/*
1. Write a program that can return the sum of even numbers between 1 to 100
 */