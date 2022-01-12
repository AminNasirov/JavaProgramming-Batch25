package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int King = 120;
        int Queen =100;
        int single= 80;
        int total=0;

        while(true){
        System.out.println(" which bedroom does he/she wants to reserve:");
        String roomType = scan.nextLine().toLowerCase();
        while(!(roomType.equals("king bed")||roomType.equals("queen bed")||roomType.equals("single bed"))){
            System.err.println("invalid entry, re-enter valid entry");
            roomType = scan.nextLine().toLowerCase();
        }
        System.out.println("how many nights he/she is staying:");
        int nights = scan.nextInt();
        scan.nextLine();
        System.out.println("would you like to reserve another room?");
        String answer = scan.nextLine().toLowerCase();

        while (!(answer.equals("yes")||answer.equals("no"))){
            System.err.println("invalid entry, re-enter valid entry");
            answer = scan.nextLine().toLowerCase();
        }

            if (roomType.equals("king bed")){
                total+=King*nights;
            }
            if (roomType.equals("queen bed")){
                total+=Queen*nights;
            }
            if (roomType.equals("single bed")){
                total+=single*nights;
            }

            if(answer.equals("no")){
                break;
            }


        }

        System.out.println("total price = "+total);


    }
}
/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */