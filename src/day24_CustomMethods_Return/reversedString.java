package day24_CustomMethods_Return;

public class reversedString {
    public static void main(String[] args) {

       String name = "Java";

       String result =reverse(name);

        System.out.println(result);

    }

    public static String reverse(String str){

        String reversed="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }

        return reversed;
    }

}
/*
create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
 */
