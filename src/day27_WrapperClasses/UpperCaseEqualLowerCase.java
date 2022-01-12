package day27_WrapperClasses;

public class UpperCaseEqualLowerCase {
    public static void main(String[] args) {

     String str = "JAVA java";

     int upperCase=0;
     int lowerCase=0;

     boolean result=false;

        for (char each : str.toCharArray()) {
            if(Character.isUpperCase(each)){
                upperCase++;
            }
            if (Character.isLowerCase(each)){
                lowerCase++;
            }
        }

        if(upperCase==lowerCase){
            result=true;
        }

        System.out.println(result);



    }
}
/*
Write program that returns true if the total number of upper case characters are equal
to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */