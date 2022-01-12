package day08_IfStatements;
/*
1. Create a class called NameOfTheMonth,
write a program that can display the name of the month

            number = 1 ~ 12
 */


public class NameOfTheMonth {

    public static void main(String[] args) {


        int number = 12;

        boolean Jan = number == 1,
                Feb = number == 2,
                Mar = number == 3,
                Apr = number == 4,
                May = number == 5,
                Jun = number == 6,
                Jul = number == 7,
                Aug = number == 8,
                Sep = number == 9,
                Oct = number == 10,
                Nov = number == 11,
                Dec = number == 12;

        if(Jan) {
            System.out.println("January");
        }
        if(Feb) {
            System.out.println("February");
        }
        if(Mar) {
            System.out.println("March");
        }
        if(Apr) {
            System.out.println("April");
        }
        if(May) {
            System.out.println("May");
        }
        if(Jun) {
            System.out.println("June");
        }
        if(Jul) {
            System.out.println("July");
        }
        if(Aug) {
            System.out.println("August");
        }
        if(Sep) {
            System.out.println("September");
        }

        if(Oct) {
            System.out.println("October");
        }

        if(Nov) {
            System.out.println("November");
        }
        if(Dec) {
            System.out.println("December");
        }






    }


}


