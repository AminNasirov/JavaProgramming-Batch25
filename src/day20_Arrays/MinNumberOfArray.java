package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

        int[] numbers ={50,4,8,10,30,40};
        int min =numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(min);
    }
}
