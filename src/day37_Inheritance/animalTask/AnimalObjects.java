package day37_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M',1,"Small","White");


        Cat cat1= new Cat("Love", "Siamese",'F',2,"Large","Black");

        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small",
                "Blue", "Colorful;");

        dog1.bark();
        cat1.scratch();
        parrot1.sing();

        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(parrot1);

    }

}
