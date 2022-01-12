package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Amin";
        String lastName = "Nasirov";
        int age = 32;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // Full name of the person is _____
        System.out.println("Full name of the person is " + fullName);


        // ____ is ___ years old

        System.out.println(fullName + " is " + age + " years old");

        // fullName is JobTittle, works at companyName, and fullName's salary is salary

        System.out.println(fullName + " is " + jobTitle + ", works at "
                + companyName + ", and " + fullName + "'s salary is $" + salary);

    }
}
