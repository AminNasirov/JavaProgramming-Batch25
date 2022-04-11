package InterviewTasksPart1;

public class PrimeNumber {
    public static void main(String[] args) {

        // prime numbers are greater than one
        // to be prime have to be divisible by 1 and the number itself
        // 7 is divisible by 1 and 7 , but is not divisible by 2, 3 ,4,5,6,
        System.out.println(isPrime(11));
    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

