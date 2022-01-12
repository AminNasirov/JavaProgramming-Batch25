package day10_NestedIf;

public class CrewAndPassenger {
    public static void main(String[] args) {

        int number = 70;

        String result = (number==50 || number==70 || number==100)? (number==50)? "20 crew, 30 passengers"
                :(number==70)? "25 crew, 50 passengers" : "30 crew, 70 passengers" : "people on the ship is not valid ";

        System.out.println(result);

    }
}
/*
2. Create a class called CrewAndPassenger, Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers.
 Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */