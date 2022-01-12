package day21_ForEachLoop;

public class MInNumber {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50,60};

        int min = numbers[0];

        for (int number : numbers) {
            if(number<min){
                min=number;
            }
        }
        System.out.println("min = " + min);

    }
}
