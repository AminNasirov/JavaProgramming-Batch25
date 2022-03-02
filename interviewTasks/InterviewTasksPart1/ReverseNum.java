package InterviewTasksPart1;

public class ReverseNum {
    public static void main(String[] args) {

 int num = reverseNum(-785);
        System.out.println(num);


    }

    public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {

            str = "-"+str.substring(0, str.length()-1);

        }

        return Integer.valueOf(str);

    }

}
