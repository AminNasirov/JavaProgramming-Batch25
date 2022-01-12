package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String[] classmates={"Amin Nasirov","Maria Meeks",
                "Kristina Edeman","Layan Assim","Nermin Horuz","Geroge Elias"};//0,1,3

        for (String each : classmates) {
           String reversed ="";
            for (int i = each.length()-1; i >=0 ; i--) {
                reversed+=each.charAt(i);

            }
            System.out.println(reversed);
        }





    }
}
