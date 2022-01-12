package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {
        String[] names = {"Amin","Amin","George","Layan","Layan","Maria","Jesus","Jesus","Jesus"};

        for (int i = 0; i < names.length; i++) {
            String element = names[i];
            int frequency = 0;

            for (int j = 0; j < names.length; j++) {
                if(names[j].equals(element)){
                    frequency++;
                }
            }
            if(frequency==2){
                System.out.println(element);
            }
        }

    }
}
