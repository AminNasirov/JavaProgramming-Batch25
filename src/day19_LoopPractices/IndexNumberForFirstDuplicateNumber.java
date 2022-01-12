package day19_LoopPractices;

public class IndexNumberForFirstDuplicateNumber {
    public static void main(String[] args) {

        String str = "abcqqqwwdrffk";
        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            char ch1 = str.charAt(i);

            for (int j = 0; j <str.length() ; j++) {
                char ch2 = str.charAt(j);
                if(ch1==ch2){
                    count++;
                }
                }
            if(count>1){
                result+=ch1;
            }
        }
        System.out.println(str.indexOf(result.substring(0,1)));

    }
}
/*
Write a program that can return the index number of the first duplicated character from a string
 */