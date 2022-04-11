package InterviewTasksPart1;

import java.util.Random;

public class RollDie {
    public static void main(String[] args) {

        int randomNumber = 0;
        int die = 0;
        int start = 0;
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            start+=randomNumber;

            randomNumber=rand.nextInt(6)+1;

            System.out.println(rand.nextInt(6));


            die=start+randomNumber;
            if (die>=40){
                die=40;
                System.out.println("start="+start+", roll="+randomNumber+", end="+die);
                break;
            }
            System.out.println("start="+start+", roll="+randomNumber+", end="+die);

        }



    }

}

/*1. Let's create a game where we roll a die, and move a player around a game board.
The board has 40 spaces, arranged in a circle

The player starts at position 0.  Loop 30 times.  Each time through the loop, do this:
- roll the die (each die has a random value, 1-6)
- print player start position, die value, and ending position

sample output:

    //     start=0, roll=3, end=3
    //     start=3, roll=2, end=5
    //     ...
//     start=38, roll=6, end=4

 */



