package day31_Constructors.day37_Inheritance.sportTask;

public class Baseball extends Sport {


    public Baseball( int numberOfPlayers, int numberOfReferees, int rules) {
        super("Baseball", numberOfPlayers, numberOfReferees, rules);
    }

    public void batter(){
        System.out.println(name + "is batter");
    }

}
