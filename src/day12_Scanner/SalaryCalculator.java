package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your hourly rate:");
        double hourlyRate = input.nextDouble();
        System.out.println("enter how many hours work in a week:");
        int hours = input.nextInt();
        System.out.println("enter state tax:");
        double stateTax = input.nextDouble();
        System.out.println("enter federal tax:");
        double federalTax = input.nextDouble();

        double salary=hourlyRate*hours*52;
        double StateTaxResult =salary*stateTax/100;
        double FederalTaxResult = salary*federalTax/100;
        double netIncome = salary-FederalTaxResult-StateTaxResult;

        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("hours = " + hours);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("salary = " + salary);
        System.out.println("StateTaxResult = " + StateTaxResult);
        System.out.println("FederalTaxResult = " + FederalTaxResult);
        System.out.println("netIncome = " + netIncome);

        input.close();






    }
}
/*
3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */