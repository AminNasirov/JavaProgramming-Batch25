package day11_Switch_Scanner;

public class CydeoBatches {
    public static void main(String[] args) {

        String batchTypes="US morning";

        //Solution 1: use if statement

        String result=(batchTypes=="US morning"||batchTypes=="US evening"||batchTypes=="EU")?
                (batchTypes=="US morning")?"Class times are 10-5 EST. M, T, Th, F."
                        :(batchTypes=="US evening")? "Class times are 7-10 EST. M, T, W, Th, S, S"
                        :"Class times are  10-5 EST. M, T, W, Th, F.":"Invalid Batch";

        System.out.println(result);
        System.out.println("------------------------------------------------------------");

        //Solution 2: use switch statement

        String result2;

        switch (batchTypes){
            case "US morning":
                result2="Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                result2="Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                result2="Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                result2="Invalid Batch";
        }

        System.out.println(result2);
        System.out.println("------------------------------------------------------------");

        //Solution 2: use if & switch statements mixed

        String result3;

        if(batchTypes=="US morning"||batchTypes=="US evening"||batchTypes=="EU"){

            switch (batchTypes){
                case "US morning":
                    result3="Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result3="Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    result3="Class times are  10-5 EST. M, T, W, Th, F.";
            }


        }else{
            result3="Invalid Batch";
        }

        System.out.println(result3);



    }
}
/*
4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Batch"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */