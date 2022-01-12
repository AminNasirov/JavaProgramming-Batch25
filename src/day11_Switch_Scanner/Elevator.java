package day11_Switch_Scanner;

public class Elevator {
    public static void main(String[] args) {

        int floorNumber =3;

        //Solution 1: use nested if statement

        String result=(floorNumber==1||floorNumber==2||floorNumber==3)?
                        (floorNumber==1)?"Floor 1 selected.\nCompanies: Lobby, Verizon, Starbucks"
                        :(floorNumber==2)?"Floor 2 selected.\nCompanies: Cybertek, NASA, Intelsat"
                        :"Floor 3 selected.\nCompanies: Lyft, BofA, Stake house"
                        :"Invalid floor - 6";
        System.out.println(result);

        //Solution 2: use switch statement

        String result2="";

        switch (floorNumber){
            case 1:
                result2="Floor 1 selected.\nCompanies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                result2="Floor 2 selected.\nCompanies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                result2="Floor 3 selected.\nCompanies: Lyft, BofA, Stake house";
                break;
            default:
                result2="Invalid floor - 6";
        }

        System.out.println("--------------------------------------------");

        System.out.println(result2);

        //Solution 2: use if & switch statements mixed

        String result3 ="";

        if(floorNumber==1||floorNumber==2||floorNumber==3){

            switch (floorNumber){

                case 1:
                    result3="Floor 1 selected.\nCompanies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    result3="Floor 2 selected.\nCompanies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    result3="Floor 3 selected.\nCompanies: Lyft, BofA, Stake house";
            }

        }else{
            result3="Invalid floor - 6";
        }

        System.out.println("--------------------------------------------");

        System.out.println(result3);


    }
}
/*
2. Create a class called Elevator. A variable named floorNumber is given,
write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */