package day09_IfStatements;
/*
3. Write a program that can check if the person is eligible to buy alcohol
 */
public class EligibleforAlcohol {
    public static void main(String[] args) {

        int age = 25;
        String name = "Jhon";

        if(age>=21){
            System.out.println(name + " is eligible for alcohol");
        }else{
            System.out.println(name + " is not eligible for alcohol");
        }


    }
}
