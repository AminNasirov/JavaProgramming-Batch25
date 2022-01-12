package day09_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {

        int number =3;
        String numberOfDays;

        if(number==4 || number==6 || number==9 || number==11){
            numberOfDays ="30 days";
        }else if(number==2){
            numberOfDays="28 days";
        }else{
            numberOfDays="31 days";
        }
        System.out.println(numberOfDays);




    }
}
/*
2. Create a class named NumberOfDays, an integer variable named month that has numbers 1 ~12 is given to you,
 write a program that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)
 */