package GroupMeeting;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {

    public static void main(String[] args) {


        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();


        cat1.setInfo("Lucy",5,'F',"small","White");
        cat2.setInfo("Lea",2,'F',"large","Black");
        cat3.setInfo("Ace",15,'M',"Extra large","Purple");


        ArrayList<Cat> list = new ArrayList<>();

        list.addAll(Arrays.asList(cat1,cat2,cat3));

        System.out.println(list);

        list.removeIf(each-> !(each.color=="Black"));

        System.out.println(list);

        System.out.println("---------------------------------");


        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

        System.out.println("---------------------------------");

        cat1.eat();
        cat2.play();
        cat3.sleep();

    }

}
