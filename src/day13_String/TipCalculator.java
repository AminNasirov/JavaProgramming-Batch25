package day13_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split:");
        String split = input.next();
        System.out.println("Enter the number of people:");
        int numberOfPeople = input.nextInt();
        System.out.println("Enter the check amount:");
        double checkAmount = input.nextDouble();
        input.nextLine();
        System.out.println("How was the srvice quality? (Excellent/Great/Good/Fair/Poor):");
        String serviceQuality = input.nextLine();
        input.close();

        double totalToPay=0;
        double totalTip=0;
        double totalPerPerson=0;
        double tipPerPerson =0;

        if ((serviceQuality.equals("Excellent") || serviceQuality.equals("Great") || serviceQuality.equals("Good")
                || serviceQuality.equals("Fair") || serviceQuality.equals("Poor"))
                && (split.equals("Yes") || split.equals("No"))&&numberOfPeople>=1) {
            if (serviceQuality.equals("Excellent") && split.equals("Yes")) {
                totalTip = checkAmount * 25 / 100;
                totalToPay = checkAmount + totalTip;
                tipPerPerson = totalTip / numberOfPeople;
                totalPerPerson = totalToPay / numberOfPeople;
            } else if (serviceQuality.equals("Great") && split.equals("Yes")) {
                totalTip = checkAmount * 20 / 100;
                tipPerPerson = totalTip / numberOfPeople;
                totalToPay = checkAmount + totalTip;
                totalPerPerson = totalToPay / numberOfPeople;
            } else if (serviceQuality.equals("Good") && split.equals("Yes")) {
                totalTip = checkAmount * 15 / 100;
                tipPerPerson = totalTip / numberOfPeople;
                totalToPay = checkAmount + totalTip;
                totalPerPerson = totalToPay / numberOfPeople;
            } else if (serviceQuality.equals("Fair") && split.equals("Yes")) {
                totalTip = checkAmount * 10 / 100;
                tipPerPerson = totalTip / numberOfPeople;
                totalToPay = checkAmount + totalTip;
                totalPerPerson = totalToPay / numberOfPeople;
            } else if (serviceQuality.equals("Poor") && split.equals("Yes")) {
                totalTip = checkAmount * 5 / 100;
                tipPerPerson = totalTip / numberOfPeople;
                totalToPay = checkAmount + totalTip;
                totalPerPerson = totalToPay / numberOfPeople;
            } else if (serviceQuality.equals("Excellent") && split.equals("No")) {
                totalTip = checkAmount * 25 / 100;
                totalToPay = checkAmount + totalTip;
            } else if (serviceQuality.equals("Great") && split.equals("No")) {
                totalTip = checkAmount * 20 / 100;
                totalToPay = checkAmount + totalTip;
            } else if (serviceQuality.equals("Good") && split.equals("No")) {
                totalTip = checkAmount * 15 / 100;
                totalToPay = checkAmount + totalTip;
            } else if (serviceQuality.equals("Fair") && split.equals("No")) {
                totalTip = checkAmount * 10 / 100;
                totalToPay = checkAmount + totalTip;
            } else {
                totalTip = checkAmount * 5 / 100;
                totalToPay = checkAmount + totalTip;
            }
             }else{
                totalTip = 0;
                totalToPay = 0;
                tipPerPerson = 0;
                totalPerPerson =0;

            }

        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);

    }

}


/*
2. Create a class called TipCalculator, write a program for a tip calculator.
 There will be different service quality benchmarks that will determine the tip given.
  There will also the ability to calculate based on the number of people in the party and
  if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output)
	Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */