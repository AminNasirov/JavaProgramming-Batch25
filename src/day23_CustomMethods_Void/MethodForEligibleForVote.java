package day23_CustomMethods_Void;

public class MethodForEligibleForVote {
    public static void main(String[] args) {

        eligibleToVote(19,"uk");

    }


    public static void eligibleToVote(int age, String country){

        if(age>=18&&country.equalsIgnoreCase("USA")){
            System.out.println("You are eligible to vote!");
        }else{
            System.err.println("You are not eligible to vote!");
        }
    }


}
/*
reate a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */