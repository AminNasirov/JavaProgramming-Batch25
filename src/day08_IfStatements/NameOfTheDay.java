package day08_IfStatements;
/*
2. Create a class called NameOfTheDay,
 write a program that can display the name of the day

            number = 1 ~ 7
 */
public class NameOfTheDay {
    public static void main(String[] args) {

        int number = 7;

        boolean Mon = number == 1,
                Tue = number == 2,
                Wed = number == 3,
                Thu = number == 4,
                Fri = number == 5,
                Sat = number == 6,
                Sun = number == 7;

        if(Mon) {
            System.out.println("Monday");
        }
        if(Tue) {
            System.out.println("Tuesday");
        }
        if(Wed) {
            System.out.println("wendhday");
        }
        if(Thu) {
            System.out.println("Thusday");
        }
        if(Fri) {
            System.out.println("Friday");
        }
        if(Sat) {
            System.out.println("Saturday");
        }
        if(Sun) {
            System.out.println("Sunday");
        }




    }
}
