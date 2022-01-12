package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String[] classmates={"Amin Nasirov","Maria Meeks",
                "Kristina Edeman","Layan Assim","Nermin Horuz","Geroge Elias"};//0,1,3

        for (String str : classmates) {
            System.out.println(str.charAt(0)+"."+str.charAt(str.indexOf(' ')+1));
        }
    }
}
