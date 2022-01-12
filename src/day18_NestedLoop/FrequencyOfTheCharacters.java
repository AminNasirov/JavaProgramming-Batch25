package day18_NestedLoop;

public class FrequencyOfTheCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";
        String ch = "";//+abcd

        for (int i = 0; i <str.length() ; i++) {//012345
            int count=0;

            if(ch.contains(""+ str.charAt(i))){
                continue;
            }
            ch+=str.charAt(i);
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>0){
                System.out.print(str.charAt(i)+""+count);
            }
        }


    }
    }

/*
4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character,
            then repeat it for all the remaining characters

 */