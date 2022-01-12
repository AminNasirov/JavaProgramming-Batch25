package InterviewTasksPart1;

public class MirrorEnds {
    public static void main(String[] args) {

        String word = "abXYZba";
        String result = "";


        String r1 ="";// abx
        for (int i = 0; i <word.length() ; i++) {
            r1+=word.substring(i,i+1);

        String r2 ="";// abz
        for (int j = word.length()-1; j >=0 ; j--) {
            r2 += word.substring(j,j+1);

            if(r1.equals(r2)){
                result=r1;
            }
        }

        }

        System.out.println(result);
    }
}
/*
(MirrorEnds)

			         Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
                     In other words, zero or more characters at the very begining of the given string, and at the very end of the
                     string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

                            mirrorEnds("abXYZba") → "ab"
                            mirrorEnds("abca") → "a"
                            mirrorEnds("aba") → "aba"

 */
