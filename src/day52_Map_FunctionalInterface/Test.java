package day52_Map_FunctionalInterface;

// lambda: () -> {}

public class Test {
    public static void main(String[] args) {


        // function1: create a function that can display a number is odd or even

        MyFirstFunctionalInterface oddOrEvenNumber =  (n) -> {
            if(n%2==0){
                System.out.println(n+" is odd number");
            }else{
                System.out.println(n+" is even number");
            }
        };

        oddOrEvenNumber.apply(20);





        // function2: create a function that can check if person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol;

        eligibleToBuyAlcohol = (age)->{
            if(age>=21){
                System.out.println("Eligible to buy Alcohol");
            }else{
                System.out.println("Not Eligible to buy Alcohol");
            }
        };

        eligibleToBuyAlcohol.apply(18);

        // function3: create a function that can display the cub of a number

        MyFirstFunctionalInterface cubOfNumber;

        cubOfNumber = number -> System.out.println(number*number*number);


        cubOfNumber.apply(3);

        // function4: create a function that can check id a number is evenly divisible 3 and 5

        MyFirstFunctionalInterface divisibleBy3And5;

        divisibleBy3And5 = n -> {
            if(n%15==0){
                System.out.println(n+" is divisible by 3 and 5");
            }else{
                System.out.println(n+" is not divisible by 3 and 5");
            }
        };

        divisibleBy3And5.apply(30);


    }
}
