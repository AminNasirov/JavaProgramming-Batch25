package day36_Inheritance.AnimalTask;

public class Cat extends Animal{ // Cat is Animal

    public void scratch(){
        System.out.println(name + " is scratching");
    }

    public void meow(){
        System.out.println(name + " is meowing");
    }
}
