package day40_FinalKeyword.day41_Exceptions;

public class TryAndCatchBlocks2 {
    public static void main(String[] args){

     int num =0;


        System.out.println("Hello");


        try {
            System.out.println("Hello1");
            System.out.println(9 / 3);
            num++;
            System.out.println("Hello2");


        }catch(ArithmeticException e) {
            System.out.println("Hello World");
            e.printStackTrace();
            System.err.println(e.getMessage());



        }finally{
            System.out.println("Always execute while exception occurs or not");
        }

        System.out.println("code checked");

        System.out.println("-----------------");

        try {
            System.out.println("Hello1");
            System.out.println(9 / 3);
            num++;
            System.out.println("Hello2");

        }catch(ArithmeticException e) {
            System.out.println("Hello World");
            e.printStackTrace();
            System.err.println(e.getMessage());



        }

        System.out.println(num);

    }
}
