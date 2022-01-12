package day27_WrapperClasses;

public class PasswordValidation {

    public static void main(String[] args) {

String password = "CYdeo78";

int upperCases =0;
int  lowerCases=0;
int specialChar= 0;
int digit =0;



        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) {
                upperCases++;
            } else if (Character.isLowerCase(each)) {
                lowerCases++;
            } else if (Character.isDigit(each)) {
                digit++;
            }else{
                specialChar++;
            }
        }


        if(password.contains(" ")){
            System.err.println("password should not contain space");
            System.exit(0);
        }

        if(password.length()>=8 && upperCases>0 && lowerCases>0 && digit>0 && specialChar>0){
            System.out.println("Password is a strong password");
        }else{
            System.err.println("Password is not a strong password");
        }










    }
}
/*
Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */