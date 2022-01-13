package day31_Constructors.day37_Inheritance.sportTask;

public class Football extends Sport{

    public Football( int numberOfPlayers, int numberOfReferees, int rules) {
        super("Football", numberOfPlayers, numberOfReferees, rules);
    }

    public void offSide(){
        System.out.println(name + " is doing it offside  ");
    }

}
