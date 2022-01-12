package day10_NestedIf;
/*
        90 ~ 100: Excellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69: Passed
        0 ~ 59: failed
 */
public class GradeReport2 {
    public static void main(String[] args) {
      int score = 500;
      String result = (score>=0 && score<=100)? (score>=90)? "Excellent"
              :(score>=80)? "Great" :(score>=70)? "Good" :(score>=60)? "Passed"
              : "failed" : "Invalid Score" ;

        System.out.println(result);


        System.out.println("-----------------------------------");
        System.out.println("------------------------------------");

        String result2 ="";

        if(score>=0 && score<=100){

             result2= (score>=90)? "Excellent"
                    :(score>=80)? "Great" :(score>=70)? "Good" :(score>=60)? "Passed"
                    : "failed";

        }else {
            result2 = "Invalid Score";

        }

        System.out.println(result2);


    }
}
