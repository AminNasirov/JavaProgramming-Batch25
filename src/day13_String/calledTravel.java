package day13_String;

import java.util.Scanner;

public class calledTravel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ask the user if they have a valid passport (yes or no):");
        String validPassport = input.nextLine();
        System.out.println("Ask the user the country they to travel to (String, multiple word):");
        String travelTo = input.nextLine();
        System.out.println("Ask the user how many bags they will take with them (byte):");
        byte howManyBags = input.nextByte();
        System.out.println("Ask the user how many people they will travel with (short):");
        short howManyPeopleTravelwith = input.nextShort();
        input.nextLine();
        System.out.println("Ask the user to Enter the name of the people they will travel with in one line,\n" +
                "            \t\t separating each name with a comma (String, multiple word)");
        String inOneLinePeople = input.nextLine();
        System.out.println("Ask the user when their passport expired(int):");
        int expiredYears = input.nextInt();
        input.nextLine();
        System.out.println("Ask the user if they will be traveling in the next year (String - yes or no):");
        String nextYearTraveling = input.nextLine();


        double ticketCost = 1000;
        double bagPrice = howManyBags * 50;
        double costAmount1 = ticketCost * (howManyPeopleTravelwith + 1) - (howManyPeopleTravelwith * 100) + bagPrice;
        double costAmount2 = ticketCost * (howManyPeopleTravelwith + 1) - 300 + bagPrice;
        double baseCostOfRenewalPassport = 200;
        double totalCostForRenewalPassportYes1 = baseCostOfRenewalPassport + (2021 - expiredYears) * 75 + 100 + costAmount1;
        double totalCostForRenewalPassportYes2 = baseCostOfRenewalPassport + (2021 - expiredYears) * 75 + 100 + costAmount2;
        double totalCostForRenewalPassportNo1 = baseCostOfRenewalPassport + (2021 - expiredYears) * 75 - 50 + costAmount1;
        double totalCostForRenewalPassportNo2 = baseCostOfRenewalPassport + (2021 - expiredYears) * 75 - 50 + costAmount2;


        if ((validPassport.equals("yes") && howManyPeopleTravelwith <= 3)
                || (validPassport.equals("yes") && howManyPeopleTravelwith > 3)
                || (validPassport.equals("no") && nextYearTraveling.equals("yes") && howManyPeopleTravelwith > 3)
                || (validPassport.equals("no") && nextYearTraveling.equals("no") && howManyPeopleTravelwith > 3)
                || (validPassport.equals("no") && nextYearTraveling.equals("yes") && howManyPeopleTravelwith <= 3)
                || (validPassport.equals("no") && nextYearTraveling.equals("no") && howManyPeopleTravelwith <= 3)) {

            if (validPassport.equals("yes") && howManyPeopleTravelwith <= 3) {
                System.out.println("Your ticket is booked to: " + travelTo);
                System.out.println("We have charged extra for the $" + bagPrice + " bags but you are traveling\n" +
                        "            \t\twith " + inOneLinePeople + " so we are giving a discount." +
                        " Your total cost is $" + costAmount1);

            } else if (validPassport.equals("yes") && howManyPeopleTravelwith > 3) {
                System.out.println("Your ticket is booked to: " + travelTo);
                System.out.println("We have charged extra for the $" + bagPrice + " bags but you are traveling\n" +
                        "            \t\twith " + inOneLinePeople + " so we are giving a discount." +
                        " Your total cost is $" + costAmount2);

            } else if (validPassport.equals("no") && nextYearTraveling.equals("yes") && howManyPeopleTravelwith > 3) {
                System.out.println("Looks like your password has been expired for " + expiredYears + ",\n" +
                        "        \t\t\tbut not to worry we will get it ready for you to travel to " + travelTo + ". \n" +
                        "        \t\t\tYour total cost has come out to $" + totalCostForRenewalPassportYes2);

            } else if (validPassport.equals("no") && nextYearTraveling.equals("yes") && howManyPeopleTravelwith <= 3) {
                System.out.println("Looks like your password has been expired for " + expiredYears + ",\n" +
                        "        \t\t\tbut not to worry we will get it ready for you to travel to " + travelTo + ". \n" +
                        "        \t\t\tYour total cost has come out to $" + totalCostForRenewalPassportYes1);

            } else if (validPassport.equals("no") && nextYearTraveling.equals("no") && howManyPeopleTravelwith > 3) {
                System.out.println("Looks like your password has been expired for " + expiredYears + ",\n" +
                        "        \t\t\tbut not to worry we will get it ready for you to travel to " + travelTo + ". \n" +
                        "        \t\t\tYour total cost has come out to $" + totalCostForRenewalPassportNo2);

            } else {
                System.out.println("Looks like your password has been expired for " + expiredYears + ",\n" +
                        "        \t\t\tbut not to worry we will get it ready for you to travel to " + travelTo + ". \n" +
                        "        \t\t\tYour total cost has come out to $" + totalCostForRenewalPassportNo1);
            }


        } else {
            System.out.println("you can not fly");

        }
    }
}


/*
3. Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					> The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line,
            		 separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName.
            		We have charged extra for the $numberOfBags bags but you are traveling
            		with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost


		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years,
        			but not to worry we will get it ready for you to travel to $allCountries.
        			Your total cost has come out to $costAmount."


 */




