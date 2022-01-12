package day24_CustomMethods_Return;

public class isPalindrome {
    public static void main(String[] args) {

        String word = "Level";

        boolean trueOrfalse = isPaindrome(word);

        System.out.println(trueOrfalse);

    }
    public static boolean isPaindrome(String str){

        String reversed ="";
        boolean result =false;

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }

        if(str.equalsIgnoreCase(reversed)){
            result=true;
          }else{
            result=false;
        }
        return result;
    }

}
/*
By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */
