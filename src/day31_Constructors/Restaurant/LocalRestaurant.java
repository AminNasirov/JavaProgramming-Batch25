package day31_Constructors.Restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {

     Restaurant restaurant1 = new Restaurant("George","Reston",5);
    // Restaurant restaurant2 = new Restaurant("Maria","Fairfax",4);
    // Restaurant restaurant3 = new Restaurant("Amin","WashingtonDC",3);

     //Restaurant[] restaurants ={restaurant1,restaurant2,restaurant3};

        Server server1 = new Server("John",22,18,true);
        Server server2 = new Server("Mark",11,16,false);
        Server server3 = new Server("James",12,18,true);

      Server[] servers={server1,server2,server3};

      Chef chef1 = new Chef("Amin",13,22,true);
      Chef chef2 = new Chef("Maria",33,20,true);
      Chef chef3 = new Chef("Layan",44,18,false);

      Chef[] chefs ={chef1,chef2,chef3};

      restaurant1.hireServer(server1);
      restaurant1.hireChef(chef2);
      restaurant1.hireServer(servers);
      restaurant1.hireChef(chefs);

      restaurant1.terminateChef(33);
      restaurant1.terminateServer(22);

        System.out.println(restaurant1);










    }
}
/*
6.4. Create a class LocalRestaurant that has a main method with the following:
- Make a Restaurant object
- Create an array of servers with their information set.
 Add those initial servers to the ArrayList of Servers in the Restaurant object
- Create an array of chefs with their information set.
 Add those initial chefs to the ArrayList of Chefs in the Restaurant object

- Print your whole restaurants information
 */
