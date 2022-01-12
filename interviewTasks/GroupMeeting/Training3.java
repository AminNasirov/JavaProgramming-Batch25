package GroupMeeting;

public class Training3 {
    public static void main(String[] args) {
        String word="@@";



        if(word.length()%2!=0&&word.length()>=3){
            System.out.println(word.charAt(word.length()/2));

        }else if(word.length()%2!=0&&word.length()==1){
            System.out.println(word.repeat(3));

        }else if(word.length()%2==0&&word.length()>=4){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
        }else if(word.length()%2==0&&word.length()==2){
            System.out.println(word.repeat(2));

        }

    }
}
