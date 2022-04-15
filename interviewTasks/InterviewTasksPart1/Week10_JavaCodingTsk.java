package InterviewTasksPart1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Week10_JavaCodingTsk {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(60,50,15,8,70,40,4));

        sortingArrayListAscending(numbers);
        sortingArrayListDescending(numbers);

        Map<String,Integer> map = new HashMap<>();
        map.put("A",5);
        map.put("M",1);
        map.put("L",2);
        map.put("G",4);
        map.put("E",3);

        System.out.println(map);

        sortMapByValues(map);

    }

    public static void sortingArrayListAscending(ArrayList<Integer> numbers){


        for (int i = 0; i < numbers.size(); i++) {

            Integer num = Integer.MAX_VALUE;

            for (int j = 0; j < numbers.size(); j++) {

                if(numbers.get(i)<numbers.get(j)){
                    num = numbers.get(i);
                    numbers.set(i,numbers.get(j));
                    numbers.set(j,num);
                }

            }

        }

        System.out.println(numbers);
    }

    public static void sortingArrayListDescending(ArrayList<Integer> numbers){


        for (int i = 0; i < numbers.size(); i++) {

            Integer num = Integer.MAX_VALUE;

            for (int j = 0; j < numbers.size(); j++) {

                if(numbers.get(i)>numbers.get(j)){
                    num = numbers.get(i);
                    numbers.set(i,numbers.get(j));
                    numbers.set(j,num);
                }

            }

        }

        System.out.println(numbers);
    }


    public static void sortMapByValues(Map<String, Integer> map){

        for (Map.Entry<String, Integer> eachPair1 : map.entrySet()) {

            for (Map.Entry<String, Integer> eachPair2 : map.entrySet()) {

                Integer min = Integer.MAX_VALUE;

                if(eachPair1.getValue()<eachPair2.getValue()){
                    min=eachPair1.getValue();
                    eachPair1.setValue(eachPair2.getValue());
                    eachPair2.setValue(min);
                }

            }

        }

        System.out.println(map);

    }


}
