package day08_IfStatements;

/*
3. Write a program that can print the maximum number between two numbers,
 if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                200 is the maximum number
 */
public class MaxNumber {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;
        boolean isMaxNumber1 =  n2>n1;
        boolean isMaxNumber2 = n1>n2;
        boolean isEqualNumber = n2==n1;

        if(isMaxNumber1){
            System.out.println(n2 + " is a maximum number" );
        }

        if(isMaxNumber2){
            System.out.println(n1 + " is a maximum number");
        }
        if(isEqualNumber){
            System.out.println("Equal");
        }



    }
}
