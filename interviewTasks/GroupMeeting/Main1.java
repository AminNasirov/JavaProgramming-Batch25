package GroupMeeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main1 {

    public static void main(String[] args) {

     ArrayList<String> numbers = new ArrayList<>(Arrays.asList("10","30","15","60","20","5"));

     Collections.sort(numbers);

        System.out.println(numbers);

        ArrayList<Integer> nums = new ArrayList<>();

        for (String each : numbers) {
            nums.add(Integer.parseInt(each));
        }

        System.out.println(nums);

        Collections.sort(nums);

        System.out.println(nums);

    }

}



