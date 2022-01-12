package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String[] group1= {"Ali","Layan","Aysenur"}; //3
        String[] group2= {"Maria","Aygun","Duygu","Suat","Valeriy"}; // 5

        String[] students = new String[group1.length+group2.length]; // 3+5


        int i =0;
        for (String each1 : group1) {
            students[i++]=each1;
        }


        for (String each2 : group2) {
            students[i++]=each2;
        }


        System.out.println(Arrays.toString(students));


        System.out.println("------------------------------------------------");

        char[] ch1 = {'A', 'B','C'};
        char[] ch2 = {'D','E','F','D','H'};

        char[] chars = new char[ch1.length+ch2.length];

        int j=0;

        for (char c1 : ch1) {
            chars[j]=c1;
            j++;
        }


        for (char c2 : ch2) {
            chars[j]=c2;
            j++;
        }

        System.out.println(Arrays.toString(chars));

    }
}
