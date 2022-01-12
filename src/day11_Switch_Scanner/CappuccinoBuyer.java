package day11_Switch_Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String sizes ="tall";

        // Solution 1: use if statement

        String result =(sizes=="tall"||sizes=="grande"||sizes=="venti")?(sizes=="tall")?"price is $3.69\n90 calories"
                :(sizes=="grande")?"price is $3.99\n120 calories":"price is $4.29\n150 calories":"Invalid Size";

        System.out.println(result);

        System.out.println("----------------------------------------------------------------------------");

        //Solution 2: use switch statement

        String result2="";

        switch (sizes){
            case "tall":
                result2="price is $3.69\n90 calories";
                break;
            case "grande":
                result2="price is $3.99\n120 calories";
                break;
            case "venti":
                result2="price is $4.29\n150 calories";
                break;
            default:
                result2="Invalid Size";

        }
        System.out.println(result2);

        System.out.println("------------------------------------------------------------------------");

        //Solution 3: use if & switch statements mixed

        String result3="";

        if(sizes=="tall"||sizes=="grande"||sizes=="venti"){

            switch (sizes){
                case "tall":
                    result3="price is $3.69\n90 calories";
                    break;
                case "grande":
                    result3="price is $3.99\n120 calories";
                    break;
                default:
                    result3="price is $4.29\n150 calories";
                    break;

            }

        }else {


            result3 = "Invalid Size";
        }

        System.out.println(result3);






    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given,
 write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */