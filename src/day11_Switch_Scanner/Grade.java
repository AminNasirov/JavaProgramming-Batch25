package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {

        char grade = 'B';
        String level ="";

        switch(grade){
            case 'A':
                level="Excellent";
                break;
            case 'B':
                level="great job";
                break;
            case 'C':
                level="good";
                break;
            case 'D':
                level="passed";
                break;
            case 'F':
                level="failed";
                break;
            default:
                level="Invalid";
                break;
        }

        System.out.println(level);
    }
}
