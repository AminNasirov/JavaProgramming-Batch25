package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DinnerForArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();      //output: [1,2,3,4,0];
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.set(list.size()-1,0);
        System.out.println(list);

        System.out.println("-------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();    // output: [5,2,3,4,1];
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

       int num = list1.get(list1.size()-1); // num=5

        list1.set(list1.size()-1, list1.get(0));  //

        list1.set(0,num);

        System.out.println(list1);

        System.out.println("-------------------------------");


        ArrayList<Integer> list2 = new ArrayList<>();    // output: [2,2,6,4,10]
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2);

        ArrayList<Integer> newList2 = new ArrayList<>();
        for (Integer each : list2) {
            if(each%2!=0){
                each*=2;
            }
            newList2.add(each);
        }

        System.out.println(newList2);


        System.out.println("-------------------------------");


        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list3 = new ArrayList<>();  // list ==> {"A", "B", "C", "D", "E", "F", "G"}

        for (String each : arr1) {
            list3.add(each);
        }

        for (String each : arr2) {
            list3.add(each);
        }

        System.out.println(list3);

        System.out.println("-------------------------------");



        ArrayList<Integer> list4 = new ArrayList<>();  //  output:  5
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
        System.out.println(list4);


        int max = list4.get(0);

        for (Integer each : list4) {
            if(each>max){
                max=each;
            }
        }

        System.out.println("max = " + max);

        System.out.println("-------------------------------");


        ArrayList<Integer> list5 = new ArrayList<>();  //  output:  1
        list5.add(1);
        list5.add(2);
        list5.add(3);
        list5.add(4);
        list5.add(5);
        System.out.println(list5);


        int min = list5.get(0);

        for (Integer each : list5) {
            if(each<min){
                min=each;
            }
        }

        System.out.println("min = " + min);

        System.out.println("-------------------------------");

        ArrayList<Integer> list6 = new ArrayList<>();  //  list = [1,2,2,3,4,4,5,6,7,7];  output : 2
        list6.add(1);
        list6.add(2);
        list6.add(2);
        list6.add(3);
        list6.add(4);
        list6.add(4);
        list6.add(5);
        list6.add(6);
        list6.add(7);
        list6.add(7);
        System.out.println(list6);

       int frequency =0; //1
       int result =0;

        for (Integer each : list6) { // 1 2 2 3 4
            for (Integer each1 : list6) { // 1 2 3
               if(each==each1) {
                   frequency++;
               }
               if(frequency==1){
                   result=each;
               }
            }

        }

        System.out.println(result);

        System.out.println("-------------------------------");

        ArrayList<Integer>  scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (Integer each : scores) {
            if(each>=90 && each<=100){
                gradeOfA.add(each);
            }else if(each>=80){
                gradeOfB.add(each);
            }else if(each>=70){
                gradeOfC.add(each);
            }else if(each>=60){
                gradeOfD.add(each);
            }else{
                gradeOfF.add(each);
            }

        }

        int countA = gradeOfA.size();
        int countB = gradeOfB.size();
        int countC = gradeOfC.size();
        int countD = gradeOfD.size();
        int countF = gradeOfF.size();

        System.out.println("gradeOfA = " + gradeOfA);
        System.out.println(countA);
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println(countB);
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println(countC);
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println(countD);
        System.out.println("gradeOfF = " + gradeOfF);
        System.out.println(countF);



    }
}
/*
1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];


2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];


3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]


4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}


5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5


6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1

7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2


8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F


 */