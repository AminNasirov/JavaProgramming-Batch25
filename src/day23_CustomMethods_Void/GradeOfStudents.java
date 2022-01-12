package day23_CustomMethods_Void;

public class GradeOfStudents {
    public static void main(String[] args) {

gradeOfStudents(70);
    }

    public static void gradeOfStudents(int score) {
        String grade = "";
        if (score >= 60 && score <= 100) {
            if (score >= 90) {
                grade = "Excellent";
            } else if (score >= 80) {
                grade = "Good";
            } else if (score >= 70) {
                grade = "Not Bad";
            } else {
                grade = "Failed";
            }
        } else {
            grade = "Invalid Number";
        }
        System.out.println(grade);

    }



}

/*
create a method that can calculate the grade of the student based on the score
 */