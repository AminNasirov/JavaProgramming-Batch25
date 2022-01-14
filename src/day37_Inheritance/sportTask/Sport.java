package day37_Inheritance.sportTask;

public class Sport {

    public String name;
    public int numberOfPlayers, numberOfReferees,rules;

    public Sport(String name, int numberOfPlayers, int numberOfReferees, int rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferees = numberOfReferees;
        this.rules = rules;

    }

    public void play(){
        System.out.println(name+ " is playing");
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferees=" + numberOfReferees +
                ", rules=" + rules +
                '}';
    }


}
/*
1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfRefere, rules



			methods:
				setInfo()
				play()
				toString()
 */
