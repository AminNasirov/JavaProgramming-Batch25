package GroupMeeting;


import java.util.Scanner;

public class Training {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Gift Card");
        int GiftCard = scan.nextInt();
        System.out.println("enter item");
        String chose = scan.next();
        String text = "";

        int currentBalance = 0;

        switch (chose) {
            case "Blanket":
                currentBalance = GiftCard - 60;
                text = "Thank you for your purchase! " + "\nYour current balance is: " + currentBalance + "$";
                break;
            case "Charger":
                currentBalance = GiftCard - 15;
                text = "Thank you for your purchase!" + "\nYour current balance is: " + currentBalance + "$";
                break;
            case "Hat":
                currentBalance = GiftCard - 25;
                text = "Thank you for your purchase! " + "\nYour current balance is: " + currentBalance + "$";
                break;
            case "Headphones":
                currentBalance = GiftCard - 30;
                text = "Thank you for your purchase! " + "\nYour current balance is: " + currentBalance + "$";
                break;
            case "Laptop":
                text = "Sorry, not enough funds on your gift card!";
                break;
            case "Pants":
                currentBalance = GiftCard - 50;
                text = "Thank you for your purchase! " + "\nYour current balance is: " + currentBalance + "$";
                break;
            case "Pillow":
                currentBalance = GiftCard - 40;
                text = "Thank you for your purchase! " + "\nYour current balance is: " + currentBalance + "$";
                break;
            case "Smartphone":
                text = text = "Sorry, not enough funds on your gift card!";
                break;
            case "Socks":
                currentBalance = GiftCard - 5;
                text = "Thank you for your purchase!" + "\nYour current balance is: " + currentBalance + "$";
                break;
            case "USB":
                currentBalance = GiftCard - 10;
                text = "Thank you for your purchase!" + "\nYour current balance is: " + currentBalance + "$";
                break;
            default:
                text = "Invalid item!";
                break;

        }
        System.out.println(text);
    }
}


