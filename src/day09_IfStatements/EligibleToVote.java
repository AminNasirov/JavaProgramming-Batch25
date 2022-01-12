package day09_IfStatements;
/*
 4. Write a program that can check if the person is eligible to vote
 */
public class EligibleToVote {
    public static void main(String[] args) {
        String name ="Karl", citizen = "USA";
        int age = 30;
        boolean result = age>= 18 && citizen=="USA";
//                         true          true
        if(result){
            System.out.println(name + " is eligible to Vote");
        }else{
            System.out.println(name + " is not eligible to Vote");
        }



    }
}
