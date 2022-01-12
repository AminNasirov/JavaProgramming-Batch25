package day17_While_DoWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your login: ");
        String login = input.nextLine();
        System.out.println("enter your password: ");
        String password = input.nextLine();

        int attempt = 3;

        while (!(login.equals("Cydeo")&&password.equals("Cydeo1234"))&&attempt>0){
            attempt--;
            System.err.println("Invalid login or password");
            System.out.println("enter again your login: ");
            login=input.nextLine();
            System.out.println("enter again your password: ");
            password=input.nextLine();


        }


        if(login.equals("Cydeo")&&password.equals("Cydeo1234")){
            System.out.println("Logged in");
        }else{
            System.out.println("your account locked");
        }

        input.close();


    }
}
/*
you are writing a code for the log-in function of the Cydeo Application,
assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched,
                the program should allow the user to have three attempts
                 to enter correct credentials and if all three attempts are failed,
                  then print "Your account is lucked."

 */