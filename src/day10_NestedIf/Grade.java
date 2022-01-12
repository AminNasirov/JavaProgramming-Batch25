package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {

        char nameGrade = 'D';

        String result =(nameGrade=='A'|| nameGrade=='B'|| nameGrade=='C'|| nameGrade=='D'|| nameGrade=='F')?
                (nameGrade=='A')? "excellent" :(nameGrade=='B')? "great job" :(nameGrade=='C')? "good"
                        :(nameGrade=='D')? "passed" :"failed":"invalid";

        System.out.println(result);

    }
}
/*
3. Create a class called Grade, a char variable named grade is given.
 write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */