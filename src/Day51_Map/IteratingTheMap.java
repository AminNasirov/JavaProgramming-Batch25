package Day51_Map;

import java.util.*;

public class IteratingTheMap {
    public static void main(String[] args) {

        Map<String,Integer> students = new HashMap<>();
        students.put("Aygun",95);
        students.put("Maria",90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",75);
        students.put("Serkan",70);
        students.put("Andriy",98);

     /*
       Set<String> keys= students.keySet();
        for (String eachKey : keys) {
           // System.out.println(eachKey+" : "+students.get(eachKey));
            students.replace(eachKey, students.get(eachKey)+5);
        }

      */

        System.out.println(students);

        Map<String,Integer> earlyBirds = new HashMap<>();
        Map<String,Integer> angryBirds = new HashMap<>();


        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);

            if(eachValue>=90){
                earlyBirds.put(eachKey,eachValue);
            }else{
                angryBirds.put(eachKey,eachValue);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        Set<String> names = students.keySet();

        System.out.println("----------------------------------------------");

     // Collection<Integer> scores =  students.values();

        List<Integer> scores = new ArrayList<>(students.values());

        System.out.println("scores = " + scores);

        for (Integer eachValue : students.values()) {
            System.out.println(eachValue);
        }

        System.out.println("----------------------------------------------");

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer value : students.values()) {
            if(value>maxScore){
                maxScore=value;
            }
            if(value<minScore){
                minScore=value;
            }

        }

        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("----------------------------------------------");

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("----------------------------------------------");

        // how many students has the score of 95 or greater

        int count =0;
/*
        for (Integer value : students.values()) {
            if(value>=95){
                count++;
            }
        }

 */

        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);
            if(eachScore>=95){
                count++;
            }
        }

        System.out.println("count = " + count);

        System.out.println("----------------------------------------------");


        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);
            System.out.println(entry.getKey()+" : " + entry.getValue());
        }







    }
}
