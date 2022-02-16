package InterviewTasksPart1;

public class repairTheHoles {

    /**
     * The road fixing machine can patch over three consecutive segments at once with asphalt
     * and repair all the potholes located within each of these segments.
     * Good or already repaired segments remain good after patching them.
     *
     */

    public static int repairTheHoles(String s){
        int repairedholes = 0;
        int index=0;
        while (index<s.length())
            if (s.charAt(index++) == 'X') {// if we have X means hole we need to repair
                repairedholes++;
                //if we find the hole we need to repair and go to next three consecutive segment
                index += 2;
            }
        return repairedholes;

    }


    public static void main(String[] args) {
        String s=".X..X";
        String s1="X.XXXXX.X.";
        System.out.println("repairTheHoles(s) = " + repairTheHoles(s));
        System.out.println("repairTheHoles(s1) = " + repairTheHoles(s1));
    }
}

