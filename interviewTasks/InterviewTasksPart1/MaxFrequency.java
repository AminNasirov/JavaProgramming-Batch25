package InterviewTasksPart1;

import java.util.Arrays;

public class MaxFrequency {
    public static void main(String[] args) {

        int[] str = { 1,1,3,3,4,4,5,5,5,5,6,7,8};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        String result="";
        int max =Integer.MIN_VALUE;

        for (int i = 0; i < str.length; i++) {
            int frequency =0;


            for (int j = 0; j < str.length; j++) {
                if(str[i]==(str[j])){
                    frequency++;
                }

            }
            if(frequency>max){
                max=frequency;
                result+=str[i]+"="+max;
            }


        }

        System.out.println(result);



    }
}
