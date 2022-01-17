package day39_Recap.animalTask;

public class Zoo {

    public static void main(String[] args) {



       Dog dog  = new Dog("Aspen","Chow-Chow",'F',4,"small","white");

       dog.setAge(dog.getAge()+2);

        Lion lion = new Lion("King","Real Furry",'M',5, "Large","yellow");

        lion.setGender('F');

        Dolphin dolphin = new Dolphin("Fliper","good dolphin",'M',5,"Medium","White");
        dolphin.eat();
        dolphin.swim();

        Bear bear= new Bear("Mishka","Grizly",'M',5,"Large","brown");
        bear.eat();


        System.out.println(dog);
        System.out.println(lion);
        System.out.println(dolphin);
        System.out.println(bear);


    }


}
/*
6. Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes
 */
