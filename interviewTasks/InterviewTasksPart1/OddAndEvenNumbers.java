package InterviewTasksPart1;

import java.util.Scanner;

public class OddAndEvenNumbers {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);



while(true) {
    int number = input.nextInt();
    if(number<=0){
        break;
    }
    if (number % 2 == 0) {
        System.out.println("Even Number");
    } else {
        System.out.println("Odd Number");
    }

}



      input.close();


    }
}
