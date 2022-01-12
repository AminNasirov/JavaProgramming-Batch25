package day09_IfStatements;

public class CharacterIdentity {
    public static void main(String[] args) {

        char character = 65;

        if(character>=48 && character<=57){
            System.out.println("digit");
        }else if((character>=65 && character<=90)||(character>=97 && character<=122))
        {
            System.out.println("Alphabetic Character");

        }else{
            System.out.println("Special Character");
        }



    }
}
/*
4. Create a class called Character Identity,
and write a program that can identify if the given character is a digit or
Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table


 */