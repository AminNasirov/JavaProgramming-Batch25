package InterviewTasksPart1;



public class ArmstrongNumber {
    public static void main(String[] args) {
        boolean test = isArmStrongNum(372);
        System.out.println(test);
    }



    public static boolean isArmStrongNum(int num){
        int temp = num;
        int r, sum = 0;

        while (num > 0){
            r = num % 10;
            num = num/10;
            sum = sum + r * r * r;
        }
        if( temp == sum){
            return true;
        }
        return false;
    }
}