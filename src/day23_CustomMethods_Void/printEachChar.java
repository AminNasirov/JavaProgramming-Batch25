package day23_CustomMethods_Void;

public class printEachChar {
    public static void main(String[] args) {

  printEachChar("book");

    }

    public static void printEachChar(String word){

        char[] ch = word.toCharArray();
        for (char each : ch) {
            System.out.println(each+" ");
        }
    }
}
/*
create a method named printEachChar that can print each characters of a string
 */
