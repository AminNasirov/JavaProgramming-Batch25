package day23_CustomMethods_Void;

public class MethodForEvenNumbers {
    public static void main(String[] args) {

        EvenNumbers();

    }

    public static void EvenNumbers(){
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }

}
/*
create a method that can print even numbers between 1~100 in a same line saperated by space
 */