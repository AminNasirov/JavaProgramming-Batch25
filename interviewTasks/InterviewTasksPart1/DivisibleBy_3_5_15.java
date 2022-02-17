package InterviewTasksPart1;

public class DivisibleBy_3_5_15 {
    public static void main(String[] args) {

        String Divisible15 = "";
        String Divisible3 = "";
        String Divisible5 = "";
        String others="";

        for (int i = 1; i <=100 ; i++) {  // 1,2,3,4,5,6.......99,100  int

            if(i%3==0 && i%5==0 && i%15==0){
                Divisible15 +=" "+i;
            }else if(i%3==0 && i%15!=0){
                Divisible3+=" "+i;
            }else if(i%5==0 && i%15!=0){
                Divisible5+=" "+i;
            }else{
                others+=i+" ";
            }

        }

        System.out.println("Divisible 15 = " + Divisible15);
        System.out.println("Divisible 3 = " + Divisible3);
        System.out.println("Divisible 5 = " + Divisible5);



    }
}
