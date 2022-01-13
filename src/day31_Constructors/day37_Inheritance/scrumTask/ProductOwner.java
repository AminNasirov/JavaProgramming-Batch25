package day31_Constructors.day37_Inheritance.scrumTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }

    public void responsible(){
        System.out.println(name + " is responsible for company");

    }


    public void represent(){
        System.out.println(name + " is representing the company");


    }

    public void manage(){
        System.out.println(name + " is managing the company");
    }


}
