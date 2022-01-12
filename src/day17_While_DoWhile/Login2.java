package day17_While_DoWhile;

import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your username: ");
        String UserName = scan.nextLine();
        System.out.println("enter your password: ");
        String Password = scan.nextLine();


        for (int i = 1; i <=3 ; i++) {
            if (UserName.equals("Cydeo") && Password.equals("Cydeo123")) {
                System.out.println("you logged in");
                break;
            } else {
                System.err.println("invalid username or password");
                System.out.println("please re-enter your username: ");
                UserName = scan.nextLine();
                System.out.println("please re-enter your password: ");
                Password = scan.nextLine();
            }
            if (i == 3) {
                System.out.println("your account locked");
            }
        }
        scan.close();
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