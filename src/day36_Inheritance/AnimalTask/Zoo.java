package day36_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setInfo("Max","Husky",'M',2,"Small","White");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        // dog.hunt();
        // dog.scratch();

        System.out.println(dog);


        Cat cat = new Cat();
        cat.setInfo("Fistik","outside cat",'M',3,"Small","orange");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        //cat.bark();
        // cat.hunt();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Leo", "Russian tabby", 'M', 1, "small", "gray");


        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.roar();
        tiger.hunt();
        //tiger.bark();

        System.out.println(tiger);



    }
}
