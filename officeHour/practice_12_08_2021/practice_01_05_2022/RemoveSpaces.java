package practice_12_08_2021.practice_01_05_2022;

public class RemoveSpaces {
    public static void main(String[] args) {

   String sentence = "  Hello world      I      love      Java    ";

    removeSpace(sentence);

    }

    public static void removeSpace(String sentence){
        String result = "";
        String[] Arr = sentence.trim().split(" ");

        for (String each : Arr) {
            if(!(each.isEmpty())){
                result+=each+" ";
            }
        }
        System.out.println(result);

    }

}
/*  (RemoveSpaces)

                      Task 3 :   Write a method that can remove  all extra space from String


                            Input: "  Hello world      I      love      Java    "
                           Output: Hello world I love Java

                     */
