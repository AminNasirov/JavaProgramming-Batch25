package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTask {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers,0,numbers.size()-1);

        System.out.println(numbers);

        System.out.println("---------------------------------------");



      ArrayList<Integer> list = new ArrayList<>();
      list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);

        int size = list.size();

        list.removeAll(Arrays.asList(0));

        System.out.println(list);

        int newSize = list.size();

        int totalNumberOfZeros = size-newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);

        }

        System.out.println(list);


        System.out.println("---------------------------------------");


        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> listCh = new ArrayList<>();

        for (int i = 0; i <str.length()-1 ; i++) {
            listCh.add(str.charAt(i));
        }

        System.out.println(listCh);

        ArrayList<Character> list1 = new ArrayList<>(listCh);
        list1.removeIf(p->!Character.isLetter(p));
        ArrayList<Character> list2 = new ArrayList<>(listCh);
        list2.removeIf(p-> !Character.isDigit(p));
        ArrayList<Character> list3 = new ArrayList<>(listCh);
        list3.removeAll(list1);
        list3.removeAll(list2);

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);










    }

}





/*
1. write a program that can swap the first and last elements of an ArrayList of Integers

2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]


3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */