package InterviewTasksPart1;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String word = "aabbccdd"; // "abcd"


        String unique ="";//abcd
        for (int i = 0; i <word.length() ; i++) {
            if(!(unique.contains(""+word.charAt(i)))){
                unique+=word.charAt(i);
            }

        }

        System.out.println(unique);
    }
}
