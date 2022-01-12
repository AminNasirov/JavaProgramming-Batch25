package utilities;

import java.util.Arrays;

public class ArraysUtility {
    
    // prints each integer of an integer array in separate lines (1)
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }
    
    // prints each double of double array in separate lines (2)
    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }
    
    // prints each String of String array in separate lines (3)
    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }
    
    // prints each char of char array in separate lines (4)
    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }



    // return max number for integer array (5)
    public static int max(int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }


    // return max number for double array (6)
    public static double max(double[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }


    // return min number for integer array (7)
    public static int min(int[] array)  {
        Arrays.sort(array);
        return array[0];
    }


    // return min number for double array (8)
    public static double min(double[] array){
        Arrays.sort(array);
        return array[0];
    }


    // checks if the given integer is contained in the given array. returns boolean. (9)
    public static boolean contains(int[] array, int element){
        boolean result = false;

        for (int each : array) {
            if(each==element){
                result=true;
            }
        }
        return result;
    }

    // checks if the given double is contained in the given array. returns boolean. (10)
    public static boolean contains(double[] array, double element){
        boolean result = false;

        for (double each : array) {
            if(each==element){
                result=true;
            }
        }
        return result;
    }

    // checks if the given char is contained in the given array. returns boolean. (11)
    public static boolean contains(char[] array, char element){
        boolean result = false;

        for (char each : array) {
            if(each==element){
                result=true;
            }
        }
        return result;
    }


    // checks if the given String is contained in the given array. returns boolean. (12)
    public static boolean contains(String[] array, String element){
        boolean result = false;

        for (String each : array) {
            if(each.equals(element)){
                result=true;
            }
        }
        return result;
    }



    // adds the given element to array, returns a new array (13)
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    // adds the given element to array, returns a new array (14)
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array (15)
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array (16)
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // returns the frequency of the given element from the given array (17)
    public  static int frequencyOfElement (int[] array, int element){

        int count = 0;
        for (int each : array) {
            if(each==element){
                count++;
            }
        }

        return count;
    }

    // returns the frequency of the given element from the given array (18)
    public  static int frequencyOfElement (double[] array, double element){

        int count = 0;
        for (double each : array) {
            if(each==element){
                count++;
            }
        }

        return count;
    }


    // returns the frequency of the given element from the given array (19)
    public  static int frequencyOfElement (char[] array, char element){

        int count = 0;
        for (char each : array) {
            if(each==element){
                count++;
            }
        }

        return count;
    }


    // returns the frequency of the given element from the given array (20)
    public  static int frequencyOfElement (String [] array, String element){

        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }

        return count;
    }


    // returns the unique elements of the array as a new array (21)
    public static int[] uniqueElements(int[] array){
        int[] result ={};

        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // returns the unique elements of the array as a new array (22)
    public static double[] uniqueElements(double[] array){
        double[] result ={};

        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // returns the unique elements of the array as a new array (23)
    public static char[] uniqueElements(char[] array){
        char[] result ={};

        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // returns the unique elements of the array as a new array (24)
    public static String[] uniqueElements(String[] array){
        String[] result ={};

        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // removes the index from the array, returns new array (25)
    public  static int[] removeElement(int[] array, int index){

        if(index<0||index>array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int [array.length-1];
        int j =0;
        for (int i=0; i<array.length; i++) {
            if(i==index){
                continue;
            }
            result[j++]=array[i];
        }
        return  result;
    }

    // removes the index from the array, returns new array (26)
    public  static double[] removeElement(double[] array, int index){

        if(index<0||index>array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double [array.length-1];
        int j =0;
        for (int i=0; i<array.length; i++) {
            if(i==index){
                continue;
            }
            result[j++]=array[i];
        }
        return  result;
    }


    // removes the index from the array, returns new array (27)
    public  static char[] removeElement(char[] array, int index){

        if(index<0||index>array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char [array.length-1];
        int j =0;
        for (int i=0; i<array.length; i++) {
            if(i==index){
                continue;
            }
            result[j++]=array[i];
        }
        return  result;
    }


    // removes the index from the array, returns new array (28)
    public  static String[] removeElement(String[] array, int index){

        if(index<0||index>array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String [array.length-1];
        int j =0;
        for (int i=0; i<array.length; i++) {
            if(i==index){
                continue;
            }
            result[j++]=array[i];
        }
        return  result;
    }


    // merges given two arrays and returns the  new array (29)
    public static int[] merge(int[] arr1, int[] arr2){

        int[] result = {};

        for (int each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }

        return result;
    }

    // merges given two arrays and returns the  new array (30)
    public static double[] merge(double[] arr1, double[] arr2){

        double[] result = {};

        for (double each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }

        return result;
    }

    // merges given two arrays and returns the  new array (31)
    public static char[] merge(char[] arr1, char[] arr2){

        char[] result = {};

        for (char each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }

        return result;
    }

    // merges given two arrays and returns the  new array (32)
    public static String[] merge(String[] arr1, String[] arr2){

        String[] result = {};

        for (String each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }

        return result;
    }


    // reverses the array, returns new array (33)
    public static int[] reverse(int[] array){
        int[] result= {};

        for (int i = array.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }

    // reverses the array, returns new array (34)
    public static double[] reverse(double[] array){
        double[] result= {};

        for (int i = array.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }

    // reverses the array, returns new array (35)
    public static char[] reverse(char[] array){
        char[] result= {};

        for (int i = array.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }

    // reverses the array, returns new array (36)
    public static String[] reverse(String[] array){
        String[] result= {};

        for (int i = array.length - 1; i >= 0; i--) {
            result=ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }

    // remove duplicate elements from array and returns new array (37)
    public static int[] removeDuplicates(int[] array){
        int[] result = {};

        for (int each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // remove duplicate elements from array and returns new array (38)
    public static double[] removeDuplicates(double[] array){
        double[] result = {};

        for (double each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // remove duplicate elements from array and returns new array (39)
    public static char[] removeDuplicates(char[] array){
        char[] result = {};

        for (char each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result= ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }

    // remove duplicate elements from array and returns new array (40)
    public static String[] removeDuplicates(String[] array){
        String[] result = {};

        for (String each : array) {
            if(!(ArraysUtility.contains(result,each))){
                result= ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }

    //Create a method named replace that passes three parameters:integer array, integer index, integer newElement.(41)
    public static int[] replace(int[] arr, int index, int element){

        if (index<0 || index>arr.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        arr[index]=element;
        return arr;
    }

    //Create a method named replace that passes three parameters:double array, integer index, double newElement.(42)
    public static double[] replace(double[] arr, int index, double element){

        if (index<0 || index>arr.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        arr[index]=element;
        return arr;
    }

    //Create a method named replace that passes three parameters:char array, integer index, char newElement.(43)
    public static char[] replace(char[] arr, int index, char element){

        if (index<0 || index>arr.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        arr[index]=element;
        return arr;
    }

    //Create a method named replace that passes three parameters:String array, integer index, String newElement.(44)
    public static String[] replace(String[] arr, int index, String element){

        if (index<0 || index>arr.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        arr[index]=element;
        return arr;
    }

    //replaces all the matching old elements of the array with the new element(45)
    public static int[] replaceAll(int[] array, int oldElement, int newElement){


        for (int i = 0; i < array.length; i++) {

            if(array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;

    }

    //replaces all the matching old elements of the array with the new element(46)
    public static double[] replaceAll(double[] array, double oldElement, double newElement){


        for (int i = 0; i < array.length; i++) {

            if(array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;

    }

    //replaces all the matching old elements of the array with the new element(47)
    public static char[] replaceAll(char[] array, char oldElement, char newElement){


        for (int i = 0; i < array.length; i++) {

            if(array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;

    }

    //replaces all the matching old elements of the array with the new element(48)
    public static String[] replaceAll(String[] array, String oldElement, String newElement){


        for (int i = 0; i < array.length; i++) {

            if(array[i].equals(oldElement)){
                array[i]=newElement;
            }
        }
        return array;

    }














}
