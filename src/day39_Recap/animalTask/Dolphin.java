package day39_Recap.animalTask;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void swim(){
        System.out.println(getName()+" is swimming");
    }

}
/*
3. Dolphin:
					Extra methods:
						swim()
 */
