package practice_12_29_2021;

import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        String[] scrum1={"Aysegul","Timur","Oleksandr","Jilili"};

        String[] scrum2={"Ali","Olga"};

        String[] scrum3={"Sergei","Yuliya","Farangez"};

        String [][] scrumTeams = {scrum1,scrum2,scrum3};
        //String [][] scrumTeams = {{"Aysegul","Timur","Oleksandr","Jilili"},{"Ali","Olga"},{"Sergei","Yuliya","Farangez"}};


        System.out.println(Arrays.deepToString(scrumTeams));

        System.out.println(scrumTeams[1][1]);

        System.out.println("===========================");

        for (String[] eachScrum : scrumTeams) {
            System.out.println(Arrays.toString(eachScrum));
        }

        System.out.println("===========================");

        for (String[] scrumTeam : scrumTeams) {
            for (String eachName : scrumTeam) {
                System.out.print(eachName+" ");
            }
        }

        System.out.println("===========================");



    }
}
