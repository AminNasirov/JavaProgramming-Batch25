package day23_CustomMethods_Void;

public class MethodForOddNumbers {
    public static void main(String[] args) {

        OddNumbers();

    }

    public static void OddNumbers() {
        for (int i = 1; i <=100 ; i++) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
/*
create a method that can print odd numbers between 1~100 in a same line saperated by space
 */