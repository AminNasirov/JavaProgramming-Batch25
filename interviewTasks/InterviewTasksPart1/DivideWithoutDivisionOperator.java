package InterviewTasksPart1;

public class DivideWithoutDivisionOperator {

    public static void main(String[] args){


      int result = DivideWithoutDivision(-10,2);

        System.out.println(result);







    }

    public static int DivideWithoutDivision(int num1, int num2){

        if(num2==0){
            throw new RuntimeException("invalid number");
        }

        int result = 0;

        for(int i = num1; i>=num2; i-=num2){
            result++;
        }

        return result;
    }

}
