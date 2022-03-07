package practice_12_08_2021.practice_01_05_2022;

public class Deeper {

    public static void main(String[] args) {

        System.out.println("Not Deep");
        deep();
        System.out.println("Not Deep");

    }

    public static void deep() {
        System.out.println(" Deep");
        deeper();
        System.out.println(" Deep");

    }

    public static void deeper() {
        System.out.println(" Deeper");

    }

}
