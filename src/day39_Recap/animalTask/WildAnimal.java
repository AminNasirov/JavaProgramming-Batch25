package day39_Recap.animalTask;

public class WildAnimal extends Animal {

    public static boolean isWild, isFriendly, isPlayable;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);

    }

    static {
        isWild=true;
        isFriendly=false;
        isPlayable=false;
    }

    public void hunt(){
        System.out.println(getName()+ " is hunting");
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                " is Wild=" + isWild +
                ", is Friendly=" + isFriendly +
                ", is Playable=" + isPlayable +
                "}";
    }
}

/*
3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */
