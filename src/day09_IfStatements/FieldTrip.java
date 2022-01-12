package day09_IfStatements;

public class FieldTrip {
    public static void main(String[] args) {

        int GradeNumber = 5;

        if(GradeNumber==1){
            System.out.println("grade - 1\n" +
                    "        location -  Apple orchard\n" +
                    "        number of groups - 3\n" +
                    "        teacher in charge - Ms. Smith");
        }else if(GradeNumber==2){
            System.out.println(" grade - 2\n" +
                    "        location - Zoo\n" +
                    "        number of groups - 7\n" +
                    "        teacher in charge - Mr. Lee");
        }else if(GradeNumber==3){
            System.out.println(" grade - 3\n" +
                    "        location - Aquarium\n" +
                    "        number of groups - 5\n" +
                    "        teacher in charge - Ms. Wilson");
        }else{
            System.out.println("... (15 lines left)");
        }


    }
}
/*
8. Create a class called FieldTrip.
Your school goes on a Field trip each year. The place you go will be based on your grade.
Given a variable gradeNumber (1-6) figure out the details of your field trip.
 Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
... (15 lines left)
 */