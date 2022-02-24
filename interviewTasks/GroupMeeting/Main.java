package GroupMeeting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> logins = new ArrayList<>();
        logins.addAll(Arrays.asList("hr70@cydeo.com","invalid@cydeo.com"));

        List<String> passwords = new ArrayList<>();
        logins.addAll(Arrays.asList("UserUser","invalid123"));


        for (int i = 0; i < logins.size(); i++) {


            for ( int i1 =0 ; i1 < passwords.size(); i1++) {

                System.out.println(logins.get(i)+" "+passwords.get(i1)+"");

            }
            System.out.println();

        }

    }
}
