package InterviewTasksPart1;

public class UniqueCharacters {
    public static void main(String[] args) {

        String word = "aabcccdeeef"; // "bdf"



        for (int i = 0; i <word.length() ; i++) {
            int frequency =0;
            for (int j = 0; j <word.length(); j++) {
                if(word.charAt(i)==word.charAt(j)){
                    frequency++;
                }
            }

            if(frequency==1){
                System.out.print(word.charAt(i));
            }

        }
    }
}
