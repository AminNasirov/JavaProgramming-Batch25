package day31_Constructors.day37_Inheritance.sportTask;

public class AmericanFootball extends Sport {

    public AmericanFootball( int numberOfPlayers, int numberOfReferees, int rules) {
        super("AmericanFootball", numberOfPlayers, numberOfReferees, rules);
    }

    public void trap() {
        System.out.println(name + " is trapping");
    }
}
