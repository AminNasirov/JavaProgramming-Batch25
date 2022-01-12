package day10_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {

        double age = 151;

        String result = (age>0 && age<=150 )? (age<21)? "Teenager" :(age>=21 && age<55)? "Adult" :"Senior" :"invalid";

        System.out.println(result);



        if(age>0 && age<=150){

            if(age<21){
                System.out.println("Teenager");
            }else if(age>=21 && age<55){
                System.out.println("Adult");

            }else{
                System.out.println("Senior");
            }

        }else{
            System.out.println("Invalid");
        }





    }
}
/*
4. Create a class called AgeGroups,
write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT


             if      =======> ?
             else if =======> :?
             else    =======> :

             if(dpskodksodkso)





 */