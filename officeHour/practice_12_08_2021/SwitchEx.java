package practice_12_08_2021;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your animal:");
        String animal = scan.nextLine().toLowerCase();

        String result ="";

        switch(animal){
            case "dog": case "cat":
                result="domestic animal";
                break;
            case "tiger":
                result = "wild animal";
                break;
            default:
                result ="unknown animal";
        }

        System.out.println(result);

        scan.close();

    }
}
