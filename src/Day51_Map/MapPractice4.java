package Day51_Map;

import java.util.*;

public class MapPractice4 {
    public static void main(String[] args) {

        String[]  group100 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[]  group101 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String [] group103 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[]  group104= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[]  group105 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};



        ArrayList<String> group1 = new ArrayList<>(Arrays.asList(group100));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList(group101));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList(group103));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList(group104));
        ArrayList<String> group5 =  new ArrayList<>(Arrays.asList(group105));




        Map<Integer,ArrayList<String>> groups = new TreeMap<>();

        groups.put(1,group1);
        groups.put(2,group2);
        groups.put(9,group9);
        groups.put(24,group24);
        groups.put(5,group5);

        System.out.println(groups);

        System.out.println("==============================================================");

      /*  for (String each : groups.get(24)) {
            System.out.println( each);
        }

       */

        System.out.println(groups.get(24).get(1).charAt(0));

        System.out.println("==============================================================");

        for (ArrayList<String> eachGroup : groups.values()) {

            for (String eachName : eachGroup) {

                System.out.println(eachName);
            }
        }








    }
}
/*
2. Given the following arrays that contains the names of the students from each group:
        String[] group1 = {};
        String[] group2 = {};
        String[] group3 = {};
        String[] group4 = {};
        String[] group5 = {};

    Create a map that contains group id and names of group members

            Map<Integer, String[]> groups = new LinkedHashMap();

        add all the group 1d and group members into the map named groups

    display the names of each student with group id of 1

    display the names of each student from each groups
 */