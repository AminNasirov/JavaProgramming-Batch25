package day31_Constructors.day37_Inheritance.sportTask;

public class Basketball extends Sport {

    public Basketball( int numberOfPlayers, int numberOfReferees, int rules) {
        super("Basketball", numberOfPlayers, numberOfReferees, rules);
    }

    public void block(){
        System.out.println(name + " is blocking");
    }
    public void assist(){
        System.out.println(name + " is assisting");
    }




}
