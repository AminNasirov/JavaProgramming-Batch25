package day19_LoopPractices;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {

        String str = "aasssddddffrt";
        String result = "";
        int highestFrequency=0;

        for (int i = 0; i <str.length() ; i++) {
            int count =0;
            char ch1 = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if(ch2==ch1){
                    count++;
                }
            }

            if(count>highestFrequency){
                highestFrequency=count;
                result+=ch1;
            }

        }

        System.out.println(highestFrequency);


    }
}
/*
6.  Write a program that can find the character that has the highest frequency from a string
 */