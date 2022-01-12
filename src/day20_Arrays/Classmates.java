package day20_Arrays;

public class Classmates {
    public static void main(String[] args) {

        String[] classmates={"Amin Nasirov","Maria Meeks",
                "Kristina Edeman","Layan Assim","Nermin Horuz","Geroge Elias"};//0,1,3

        classmates[0]="Amin Nasirov";
        classmates[1]="Maria Meeks";

        for (int i = 0; i < classmates.length; i++) {
            String each = classmates[i];
            System.out.println(""+each.charAt(0)+each.charAt(each.indexOf(' ')+1));

        }

    }
}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */