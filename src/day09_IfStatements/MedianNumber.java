package day09_IfStatements;
/*
2. Create a class called MedianNumber.
write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */
public class MedianNumber {
    public static void main(String[] args) {
        int a = 60;
        int b = 50;
        int c = 90;
        boolean isMedianNumber1 = (a>b && a<c) || (a>c && a<b);
        boolean isMedianNumber2 = (b>a && b<c) || (b>c && b<a);
        //boolean isMedianNumber3 = (c>a && c<b) || (c>b && c<a);
         boolean isMedianNumber3 = !isMedianNumber1 && !isMedianNumber2;

        if(isMedianNumber1){
            System.out.println(a + " is the Median Number");
        }

        if(isMedianNumber2){
            System.out.println(b + " is the Median Number");
        }

        if(isMedianNumber3){
            System.out.println(c + " is the Median Number");
        }

    }
}
