package day17_While_DoWhile;

import java.util.Scanner;
public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve room? yes/no: ");
        String answerForReserve = scan.nextLine();

        String roomType = "";

        int KingBed = 120;
        int QueenBed = 100;
        int SingleBed = 80;

        while(!(answerForReserve.equalsIgnoreCase("yes")||answerForReserve.equalsIgnoreCase("no"))){
            System.err.println("reenter valid answer: ");
            answerForReserve= scan.nextLine();
        }
        if(answerForReserve.equalsIgnoreCase("yes")){
            System.out.println("which type of room the user wants to reserve: ");
            roomType = scan.nextLine();
            while(!(roomType.equalsIgnoreCase("King Bed")
                    ||roomType.equalsIgnoreCase("Queen Bed")
                    ||roomType.equalsIgnoreCase("Single Bed"))){
                System.err.println("reselect valid room type: ");
                roomType = scan.nextLine();
            }
            if(roomType.equalsIgnoreCase("King Bed")){
                System.out.println("King bed price is = $"+KingBed);
            }
            if(roomType.equalsIgnoreCase("Queen Bed")){
                System.out.println("Queen bed price is = $"+QueenBed);
            }
            if(roomType.equalsIgnoreCase("Single Bed")){
                System.out.println("Single bed price is = $"+SingleBed);
            }
        }else{
            System.out.println("have a nice day");
        }

        scan.close();

    }
}
