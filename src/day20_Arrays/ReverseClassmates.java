package day20_Arrays;

public class ReverseClassmates {
    public static void main(String[] args) {

        String[] classmates={"Amin Nasirov","Maria Meeks",
                "Kristina Edeman","Layan Assim","Nermin Horuz","Geroge Elias"};


        for (int i = 0; i < classmates.length; i++) {
            String name =classmates[i];
            String reversNames ="";
            for (int j =name.length()-1; j >=0 ; j--) {
                reversNames+=name.charAt(j);

            }
            System.out.println(reversNames);
        }


    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */