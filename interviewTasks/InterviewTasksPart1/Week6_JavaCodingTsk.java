package InterviewTasksPart1;

public class Week6_JavaCodingTsk {
    public static void main(String[] args) {

        String password = "Qtfldkfldk147$";
        verifyPassword(password);

        String numbers = "123123ajdkf";
       int result= sumOfDigitsFromString(numbers);
        System.out.println("result = " + result);

        int [] arr = {1,2,3,4,5,6,1000};
        int maxNumber= maxValueFromArray(arr);
        System.out.println("maxNumber = " + maxNumber);

    }

    public static void verifyPassword(String str){

        int digits = 0;
        int upperCase=0;
        int lowerCase=0;
        int characters=0;

        for (char each : str.toCharArray()) {
            if(Character.isDigit(each)){
                digits++;
            }else if(Character.isLowerCase(each)){
                lowerCase++;
            }else if(Character.isUpperCase(each)){
                upperCase++;
            }else{
                characters++;
            }

        }

        if(str.length()>=6 && !str.contains(" ")&& upperCase>0 &&
                lowerCase>0&&characters>0 && digits>0){
            System.out.println("your password is strong");
        }else{
            System.err.println("password is not strong");
        }


    }


    public static int sumOfDigitsFromString(String digits){

        String result="";
        for (char each : digits.toCharArray()) {
            if(Character.isDigit(each)){
                result+=each;
            }
        }



        int sum=0;
        for (char each : result.toCharArray()) {  // 123  ['1' , '2' ,'3']

            sum+=Character.getNumericValue(each);
        }

        return sum;

    }

    public static int maxValueFromArray(int[] num){

        int max = Integer.MIN_VALUE;

        for (int each : num) {
            if(each>max){
                max=each;
            }
        }
       return max;
    }

}
