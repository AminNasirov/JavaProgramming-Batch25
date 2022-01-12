package day23_CustomMethods_Void;

public class PrintFullNameRegular {
    public static void main(String[] args) {

        regularFullName("aMIn","nAsirOV");

    }

    public static void regularFullName(String name, String lastName){

        name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(name+" "+lastName);

    }

}
/*
write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
 */