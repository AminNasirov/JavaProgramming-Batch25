package GroupMeeting;



import java.util.*;

public class Main {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";

       String[] arr = str.split("");

        Map<String,Integer> map = new TreeMap<>();

        for (String each : arr) {
            map.put(each, Collections.frequency(Arrays.asList(arr),each));
        }

        System.out.println(map);

        String result ="";

        for (int i = 0; i < str.length(); i++) {
            int frequency=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    frequency++;
                }
            }

            if(!result.contains(""+str.charAt(i))){
                result+=""+str.charAt(i)+frequency;
            }


        }

        System.out.println(result);

        System.out.println(0.2+0.1);
        System.out.println(0.2+0.8);
        System.out.println(0.8*2);
        System.out.println(0.0/0.0);  // NaN
      //  System.out.println(9/0);






    }
}
