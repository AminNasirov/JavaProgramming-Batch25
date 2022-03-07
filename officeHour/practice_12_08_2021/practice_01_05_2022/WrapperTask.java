package practice_12_08_2021.practice_01_05_2022;

public class WrapperTask {

    public static void main(String[] args) {

        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

        String result="";

        for (char each:str.toCharArray()) {
            if(Character.isLetter(each)||each==' '){
                result+=each;
            }
        }

        System.out.println(result.trim());

    }



}
/*   (WraperTask)

                   Task :

                        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

                        Write a method that returns : Welcome To Core Java

                */