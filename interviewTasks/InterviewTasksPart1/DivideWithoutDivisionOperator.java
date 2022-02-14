package InterviewTasksPart1;

public class DivideWithoutDivisionOperator {

    public static void main(String[] args){


      int result = DivideWithoutDivision(10,2);

        System.out.println(result);


    }

    public static int DivideWithoutDivision(int divided, int divisor){

       if(divided<0||divisor<=0){
           throw new RuntimeException("invalid number");
       }

        int quotient = 0;

        for(int i = divided; i>=divisor; i-=divisor){ // 10/2=5   10-2   8-2   6-2   4-2    2-2
            quotient++;                                         // 1      2     3     4      5
        }

        return quotient;
    }

}
