package InterviewTasksPart1;

public class DivideWithoutDivisionOperator {

    public static void main(String[] args){


        int num1 = 97;
        int num2 = 3;
        int result = 0;

        for(int i = 0; i<=num1-num2; i+=num2){
            result++;
        }
        System.out.println(result);
    }

}
