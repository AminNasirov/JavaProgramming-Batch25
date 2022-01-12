package day31_Constructors.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String Owner, Location;
    public int numberOfStars;
    public ArrayList<Server> serverList = new ArrayList<>();
    public ArrayList<Chef> chefList = new ArrayList<>();

    public Restaurant(String Owner, String Location, int numberOfStars) {
       this. Owner = Owner;
       this. Location = Location;
       this. numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        serverList.add(server);
    }

    public void hireServer(Server[] servers){
        serverList.addAll(Arrays.asList(servers));
    }

    public void  hireChef(Chef chef){
        chefList.add(chef);
    }

    public void hireChef(Chef[] chefs){
        chefList.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID){
        chefList.removeIf(p-> p.employeeID==employeeID);
    }

    public void terminateServer(int employeeID){
        serverList.removeIf(p-> p.employeeID==employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", serverList=" + serverList.size() +
                ", chefList=" + chefList.size() +
                '}';
    }
}
/*
6.3 Create a class called Restaurant

	            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

	                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
	                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

	                terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
	                terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

	                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information


 */
