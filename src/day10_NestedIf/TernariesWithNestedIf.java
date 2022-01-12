package day10_NestedIf;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int s = 85;

        String result = (s>=0 && s<=100)? (s>=60)? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result);

    }
}
