package day24_CustomMethods_Return;

public class frequency {
    public static void main(String[] args) {

        int[] numbers ={1,1,1,1,1,2,2};

        int result = frequency(numbers,1);

        System.out.println(result);


    }
    public static int frequency(int[]array, int number){

        int count =0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]==number){
                count++;

            }
        }

        return count;

    }


}
/*
create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */
