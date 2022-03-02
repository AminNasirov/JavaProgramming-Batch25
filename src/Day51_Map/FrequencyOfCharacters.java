package Day51_Map;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        String[] arr = str.split("");

        Map<String,Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            result.put(each, Collections.frequency(Arrays.asList(arr),each));
        }

        System.out.println(result);


    }
}
/*
2. Wirte a program that can return the freuqency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}
 */