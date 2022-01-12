package day10_NestedIf;

public class CalculateSalary {
    public static void main(String[] args) {

        int salary = 70_000;
        boolean IfMarried = true;
        double SalaryAfterTax ;


        if(!IfMarried && salary>=130_000){
            SalaryAfterTax=salary-(salary*0.35);
        }else if(IfMarried && salary>=130_000){
            SalaryAfterTax=salary-(salary*0.35) +(salary*0.05);
        }else if(!IfMarried && salary>=100_000){
            SalaryAfterTax=salary-(salary*0.30);
        }else if(IfMarried && salary>=100_000){
            SalaryAfterTax=salary-(salary*0.30) +(salary*0.05);
        }else if(!IfMarried && salary>=80_000){
            SalaryAfterTax=salary-(salary*0.25);
        }else if(IfMarried && salary>=80_000){
            SalaryAfterTax=salary-(salary*0.25)+(salary*0.05);
        }else if(!IfMarried && salary<80_000){
            SalaryAfterTax=salary-(salary*0.20);
        }else{
            SalaryAfterTax=salary-(salary*0.20)+(salary*0.05);
        }

        System.out.println(SalaryAfterTax);



    }

}
/*
2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */