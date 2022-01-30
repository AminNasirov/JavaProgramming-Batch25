package day42_Exceptions;

class FadyException extends RuntimeException{ // custom unchecked exception

    public FadyException(){
        super("Time for a short break");
    }

    public FadyException(String message){
        super(message);
    }

}


class NoBreakException extends Exception{ // custom checked exception

    public NoBreakException(String str){
        super(str);
    }



}

public class CustomExceptions {

    public static void main(String[] args)  {

        // throw new FadyException("It's time for lunch break");


        try {
            throw new NoBreakException(" there is not any break");
        } catch (NoBreakException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();


        }


    }
}
