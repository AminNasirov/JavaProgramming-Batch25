package GroupMeeting;

public class Phone {

    static  int number;
    public Phone(String str){// 7+6
        this(str.length()); // this(6);
    }
    public  Phone(int num){ //1+5=6+1=7
        this();
        number+=num;
    }
    public  Phone(){  //1
        number+=1;
    }
}
class CallPhones{
    public static void main(String[] args) {
        new Phone("iphone");
        new Phone();
        new Phone(4);
        System.out.println(Phone.number);
    }
}




