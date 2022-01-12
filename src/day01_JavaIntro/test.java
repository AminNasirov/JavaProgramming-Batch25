package day01_JavaIntro;

import utilities.ArraysUtility;
import utilities.MathUtility;
import utilities.StringUtility;

public class test {
    public static void main(String[] args) {

        String name = "Level";

        String reversedName = StringUtility.reversed(name);

        System.out.println(reversedName);

        boolean palindrome = StringUtility.isPalindrome(name);

        System.out.println("palindrome = " + palindrome);


        String[] names = {"Anna","Java","Python","racecar","mom","Cydeo"};

        int count = 0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println("count = " + count);


        String s2 = "aaaaaabbbbbccccccdddddd";

        String nonDup = StringUtility.removeDuplicates(s2);

        System.out.println(nonDup);

        int n = 10;
        double r = 5.5;

        double sum = MathUtility.cube(r);

        System.out.println(sum);




    }
}
