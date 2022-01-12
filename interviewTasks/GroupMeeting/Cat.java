package GroupMeeting;

public class Cat {

 public String name;
 public int age;
 public char gender;
 public String size;
 public String color;

    public void setInfo(String name, int age, char gender, String size, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void eat(){
        System.out.println(name+" eating every day");
    }

    public void play(){
        System.out.println(name+ " playing all day");
    }

    public void sleep(){
        System.out.println(name+" not sleeping enough");
    }



}
/*
Attributes:
    name, age, gender, breed, size, color

Actions:
    eat(), play(), sleep(), .....


 */