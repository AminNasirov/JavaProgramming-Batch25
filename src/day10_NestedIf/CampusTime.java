package day10_NestedIf;

public class CampusTime {
    public static void main(String[] args) {

     int number =23;
     //first option
     String CampusTime = "";

     if(number>=1 && number<=24){
         if(number>=8 && number<=23){
             CampusTime="Open";
         }else{
             CampusTime="Closed";
         }

     }else{
         CampusTime="Invalid Number";
     }

     System.out.println(CampusTime);

     //2nd option
        String CampusTime1 = (number>=1 && number<=24)? (number>=8 && number<=23)? "Open"
                : "Closed" :"Invalid Number";

        System.out.println(CampusTime1);



    }
}
/*
1.  Create a class called CampusTime,
 an integer variable named time is given with a number between 1~24 has been initialized,
  write a program that can find out if the campus is open or not.
  Campus is open from 8 am(8) to 11 pm (23) If user enters a time
  within the open time they should see message:
  “open”  but if the time entered is outside of operating hours they should see:“ closed”
 */