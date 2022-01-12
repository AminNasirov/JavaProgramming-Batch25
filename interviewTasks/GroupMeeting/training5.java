package GroupMeeting;

import java.util.Arrays;

public class training5 {
    public static void main(String[] args) {

        int arr[]={10, 0, 5, 0, 1, 0};
        int newArr[]=new int[arr.length];
        int j = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0){
                newArr[j] = arr[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(newArr));
    }
}


