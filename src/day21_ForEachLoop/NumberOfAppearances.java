package day21_ForEachLoop;

import java.util.Arrays;

public class NumberOfAppearances {
    public static void main(String[] args) {
        String sentences ="I love java and python";
        String[] word = sentences.split(" ");

        int java =0;
        int python =0;
        for (String each : word) {
            if(each.equals("java")){
               java++;
            }
            if(each.equals("python")){
                python++;
            }

        }

        System.out.println(Arrays.toString(word));
        System.out.println("python = " + python);
        System.out.println("java = " + java);

    }
}
/*
6. Write a program that can return the number of appearances of
“java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it,
				but this time you MUST use arrays and for each loop)



 */