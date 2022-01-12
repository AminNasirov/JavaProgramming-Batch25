package GroupMeeting;

public class Main {
    public static void main(final String arg[]) {


        int number = 20;

        long factorial = 1l; // because result out of range with int

        for (int i = 1; i <=number ; i++) { // 1*2*3*4*5    5*4*3*2*1

            factorial*=i;

        }

        System.out.println(factorial);


    }
}


