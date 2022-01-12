package day17_While_DoWhile.day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

initials("amin","nasirov");

nameOfMonth(11);
nameOfDay(7);

String sentence ="aabbcddee";
uniqueCharacter(sentence);

int [] numbers ={7,8,7,7,9,9,10,10};
uniqueElementOfIntegerArray(numbers);

domain("amin_nasirov@yahoo.com");


String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

for (String email : emails) {
    domain(email);
        }




    }

    public static void initials(String name,String lastName){

        String initial = name.charAt(0) +"."+ lastName.charAt(0);
        initial=initial.toUpperCase();
        System.out.println("initial = " + initial);

    }
    public static void domain(String email){
     String domain = email.substring(email.indexOf('@')+1,email.lastIndexOf('.'));
        System.out.println("domain = " + domain);
}
    public static void nameOfMonth(int number){

        String name = "";

        if(number >= 1 && number <= 12){

            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";

        }else{
            name = "Invalid";
        }

        System.out.println("Month name = " + name);

    }
    public static void nameOfDay(int number){
        String day=(number>=1&&number<=7)?(number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursday"
                :(number==5)?"Friday":(number==6)?"Saturday":"Sunday":"Invalid Number";

        System.out.println("day = " + day);
    }
    public static void uniqueCharacter(String word){
       String ch="";
        for (int i = 0; i <word.length() ; i++) {
          if(word.indexOf(word.charAt(i))==word.lastIndexOf(word.charAt(i))){
              ch+=word.charAt(i);
          }
        }
        System.out.println("unique character = " + ch);
    }
    public static void uniqueElementOfIntegerArray(int[]number ){

        for (int i = 0; i < number.length; i++) {
            int element =number[i];
            int frequency=0;
            for (int j = 0; j < number.length; j++) {
                if(number[j]==element){
                    frequency++;
                }
            }
             if(frequency==1){
                 System.out.println("unique element is: " +element);
             }
        }

    }
}
/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
//6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
7. create a method that can display the unique characters of a string

8. create a method that can display the unique elements of an integer array
 */
