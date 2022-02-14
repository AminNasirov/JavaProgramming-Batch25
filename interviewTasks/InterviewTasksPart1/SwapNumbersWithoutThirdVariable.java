package InterviewTasksPart1;

public class SwapNumbersWithoutThirdVariable {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 30;

        if(num1 == 0 || num2==0) {
            throw new RuntimeException("Invalid number");
        }

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);


    }
}
