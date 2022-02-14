package day47_Polymorphism;

import day43_Abstraction.EmployeeTask.*;
import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Cat;
import day44_Abstraction.AnimalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public  class ReferenceTypeCastings {
    public static void main(String[] args) {

     //   Shape shape = (Shape) new Circle(4);    // upcasting

        Shape shape2 = new Circle(5); // upcasting

        // WebDriver driver = (WebDriver) new ChromeDriver();

       // Dog dog2 =  new Dog("Max", "Husky", 'M', 3, "Small", "White");

      //  Dog dog3 = dog2;

        Animal animal =  new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog =  new Dog("Lucy", "Husky", 'F', 5, "Small", "White");

        // Dog dog = (Dog)animal;

        System.out.println(animal.getName());
        System.out.println(dog.getName());

        ((Dog)animal).bark();
        dog.bark();

        System.out.println("---------------------------------------------------");

       Shape shape1 = new Square(5);
        System.out.println( ((Square) shape1).getSide() );

        System.out.println("---------------------------------------------------");


        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

     //  Cat cat = (Cat) animal2;
     //  cat.meow();

       ((Cat) animal2).meow();

      //  ((Dog)animal2).bark();    // ClassCastException


        System.out.println("----------------------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        ((Tester)employee).bugReport(); //downCasting

        ((Developer)employee).unitTest(); // ClassCastException

       // Driver driver = (Driver) employee;    // line 1  ClassCastException

        Person person =(Person) employee;     // line 2  upcasting

       // Teacher teacher = (Teacher) employee; // line 3  ClassCastException

        System.out.println("----------------------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();


        //((Cube)s1).volume();  // ClassCastException





    }
}
