package InterviewTasksPart1;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "JavaJavaJava";
        String word = "";
        int frequency =0;

        for (int i = 0; i <=sentence.length()-4 ; i++) {
            word=sentence.substring(i,i+4);

            if(word.contains("Java")){
                frequency++;
            }

        }

        System.out.println(frequency);




    }
}
/*
2. write a program that can return the frequency of the word Java from the sentence
        Ex:
            sentence = "JavaJavaJava";
            output: 3
           	Str = "JavaJava";
           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)

 */