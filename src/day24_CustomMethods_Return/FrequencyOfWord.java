package day24_CustomMethods_Return;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence ="java java java python python";
        String word = "java";

        int result= frequencyOfWord(sentence,word);

        System.out.println(result);
    }

   public static int  frequencyOfWord(String sentence,String word){

        int count =0;
       String sentemce1[]=sentence.split(" ");

       for (String each : sentemce1) {
           if(each.contains(word)){
               count++;
       }

        }
        return count;
   }

}
/*
create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */
