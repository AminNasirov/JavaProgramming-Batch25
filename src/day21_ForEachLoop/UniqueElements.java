package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam",
                "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};




        for (String each : words) {
            int count =0;
            for (String each2:words) {
                if (each2.equals(each)) {
                    count++;
                }
            }

            if(count==1){
                System.out.println(each);
            }
        }


    }
}
