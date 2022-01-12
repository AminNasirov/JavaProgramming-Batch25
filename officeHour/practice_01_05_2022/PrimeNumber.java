package practice_01_05_2022;

public class PrimeNumber {
    public static void main(String[] args) {

        for (int i = 0; i <100 ; i++) {
            int frequency=0;
            for (int j = i; j >=1 ; j--) {
                if(i%j==0){
                    frequency++;
                }
            }
            if(frequency==2){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        System.out.println("---------------------------");



        for (int i = 0; i <=100; i++) {
            if (primeNumber(i)) {

                System.out.print(i+" ");
            }

        }
        System.out.println();

        boolean result = primeNumber(4);

        System.out.println(result);
    }

    public static boolean primeNumber(int num){
        boolean result =true;

        if(num<=1){
            result=false;
        }

        for (int i = 2; i <num ; i++) {
            if(num%i==0){
                result=false;
            }
        }


        return result;
    }

}
/*  (PrimeNumber)

 Task 1 :   Write a method that can check if a number is prime or not
 Note : Prime numbers are special numbers, greater than 1,
 that have exactly two factors, themselves and 1

 10 -- 10 and 1 it is Prime     10 / 1-2-5-10         it is not Prime
   7                              7  / 1-7             PrimeNumber
 13                             13/  1-13             PrimeNumber
  9                              9 /  1-3-9           it is not Prime

*/
