package day17_While_DoWhile;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter you name: ");
        String name = scan.nextLine();
        System.out.println("enter your gender: male/female ");

        String gender = "";
        String ifMarried ="";
        int age =0;
        int mileage = 5;
        String insuranceType = "";
        String accidentHistory="";
        String antiTheft= "";
        int priceForLiability=0;
        int priceForFullCoverage=0;
        int milesForLiability=0;
        int milesForFullCoverage=0;

        gender= scan.nextLine();
        while(!(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("famale"))){
            System.err.println("reenter valid information: ");
            gender= scan.nextLine();
        }
        System.out.println("are you married? yes/no: ");
        ifMarried= scan.nextLine();
        while (!(ifMarried.equalsIgnoreCase("yes")||ifMarried.equalsIgnoreCase("no"))){
            System.err.println("reenter valid information: ");
            ifMarried= scan.nextLine();
        }
        System.out.println("enter your age: ");
        age= scan.nextInt();
        while(!(age>=0&&age<=120)){
            System.err.println("reenter valid information: ");
            age= scan.nextInt();
        }
        System.out.println("enter how many miles  drives in a day:");
        mileage= scan.nextInt();
        while (!(mileage>=5)){
            System.err.println("reenter valid information: ");
            mileage= scan.nextInt();
        }
        scan.nextLine();
        System.out.println("do you wants full coverage or liability insurance? ");
        insuranceType= scan.nextLine();
        while( !(insuranceType.equalsIgnoreCase("full coverage")
                ||insuranceType.equalsIgnoreCase("liability"))){
            System.err.println("reenter valid information: ");
            insuranceType= scan.nextLine();
        }
        System.out.println("any accidents or claims in past 5 years (Yes/No)? ");
        accidentHistory= scan.nextLine();
        while(!(accidentHistory.equalsIgnoreCase("yes")
                ||accidentHistory.equalsIgnoreCase("no"))){
            System.err.println("reenter valid information: ");
            accidentHistory= scan.nextLine();
        }
        System.out.println("car has an anti-theft device (Yes/No)? ");
        antiTheft= scan.nextLine();
        while (!(antiTheft.equalsIgnoreCase("yes")
        ||antiTheft.equalsIgnoreCase("no"))){
            System.err.println("reenter valid information: ");
            antiTheft= scan.nextLine();
        }

        if(age<25){
            priceForLiability=90;
            priceForFullCoverage=160;
        }else{
            priceForLiability=50;
            priceForFullCoverage=120;
        }
        if(mileage<=10){
            milesForLiability=10;
            milesForFullCoverage=20;

        }else if(mileage>10&&mileage<=50){
            milesForLiability=30;
            milesForFullCoverage=40;
        }else{
            milesForLiability=50;
            milesForFullCoverage=70;
        }

       double totalPriceForLiability =priceForLiability+milesForLiability;
        double totalPriceForFullCoverage = priceForFullCoverage+milesForFullCoverage;

        if(antiTheft.equalsIgnoreCase("yes")
                &&accidentHistory.equalsIgnoreCase("yes")
                &&ifMarried.equalsIgnoreCase("yes")){
            totalPriceForFullCoverage=totalPriceForFullCoverage-totalPriceForFullCoverage*0.05
                    +0.15*totalPriceForFullCoverage-0.05*totalPriceForFullCoverage;
            totalPriceForLiability=totalPriceForLiability-totalPriceForLiability*0.05
                    +0.15*totalPriceForLiability-0.05*totalPriceForLiability;
        }else if(antiTheft.equalsIgnoreCase("yes")
                &&accidentHistory.equalsIgnoreCase("no")
                &&ifMarried.equalsIgnoreCase("yes")){
            totalPriceForFullCoverage=totalPriceForFullCoverage-totalPriceForFullCoverage*0.05
                    -0.10*totalPriceForFullCoverage-0.05*totalPriceForFullCoverage;
            totalPriceForLiability=totalPriceForLiability-totalPriceForLiability*0.05
                    -0.10*totalPriceForLiability-0.05*totalPriceForLiability;
        }else if(antiTheft.equalsIgnoreCase("no")
                &&accidentHistory.equalsIgnoreCase("yes")
                &&ifMarried.equalsIgnoreCase("yes")){
            totalPriceForFullCoverage=totalPriceForFullCoverage
                    +0.15*totalPriceForFullCoverage-0.05*totalPriceForFullCoverage;
            totalPriceForLiability=totalPriceForLiability
                    +0.15*totalPriceForLiability-0.05*totalPriceForLiability;
        }else if(antiTheft.equalsIgnoreCase("yes")
                &&accidentHistory.equalsIgnoreCase("yes")
                &&ifMarried.equalsIgnoreCase("no")){
            totalPriceForFullCoverage=totalPriceForFullCoverage-totalPriceForFullCoverage*0.05
                    +0.15*totalPriceForFullCoverage;
            totalPriceForLiability=totalPriceForLiability-totalPriceForLiability*0.05
                    +0.15*totalPriceForLiability;
        }else if(antiTheft.equalsIgnoreCase("no")
                &&accidentHistory.equalsIgnoreCase("yes")
                &&ifMarried.equalsIgnoreCase("no")){
            totalPriceForFullCoverage=totalPriceForFullCoverage
                    +0.15*totalPriceForFullCoverage;
            totalPriceForLiability=totalPriceForLiability
                    +0.15*totalPriceForLiability;
        }else if(antiTheft.equalsIgnoreCase("no")
                &&accidentHistory.equalsIgnoreCase("no")
                &&ifMarried.equalsIgnoreCase("yes")){
            totalPriceForFullCoverage=totalPriceForFullCoverage-0.10*totalPriceForFullCoverage
                    -0.05*totalPriceForFullCoverage;
            totalPriceForLiability=totalPriceForLiability-totalPriceForLiability*0.10
                    -0.05*totalPriceForLiability;
        }else{
            totalPriceForFullCoverage=totalPriceForFullCoverage-0.10*totalPriceForFullCoverage;

            totalPriceForLiability=totalPriceForLiability-totalPriceForLiability*0.10;

        }
         if(insuranceType.equalsIgnoreCase("full coverage")) {
             System.out.println("your quote for Full coverage insurance = " + totalPriceForFullCoverage);
         }
         if(insuranceType.equalsIgnoreCase("liability")) {
             System.out.println("your quote for Liability insurance = " + totalPriceForLiability);
         }
    scan.close();
    }
}
/*
6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount

 */