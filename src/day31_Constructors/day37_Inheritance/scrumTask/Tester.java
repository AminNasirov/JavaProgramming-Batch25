package day31_Constructors.day37_Inheritance.scrumTask;

public class Tester extends Employee { // Tester is A Employee

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void test(){
        System.out.println( jobTitle + " " + name + "is testing");
    }
    public void createTicket(){
        System.out.println(jobTitle + " " + name + "is creating ticket");
    }

}
/*
Create a sub class of Employee named Tester:

            Add any extra variable or method that Tester object need to have
test()     create a ticket(),
 */
