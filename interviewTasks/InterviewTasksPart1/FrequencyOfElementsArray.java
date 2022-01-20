package InterviewTasksPart1;

public class FrequencyOfElementsArray {
    public static void main(String[] args) {

        String[] str = {"Nermin", "loves", "Java", "Java", "Nermin"};
        String result = "";


        for (int j = 0; j < str.length; j++) {

            int frequency = 0;
            for (int i = 0 ; i < str.length; i++) {
                if (str[j].equals(str[i])) {
                    frequency++;
                }
            }
            if(!(result.contains(str[j]))){
                result+=str[j]+"="+frequency+"\n";
            }

        }

        System.out.println(result);



    }
}
