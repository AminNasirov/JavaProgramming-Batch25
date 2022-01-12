package day04_Variables;

/*

    2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
                        length
                        width

                        area = length * width
                        perimeter =  2 * (length + width)
 */

public class Rectangle {

    public static void main(String[] args) {

        int length = 40;
        int width = 5;
        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("width = " + width);
        System.out.println("length = " + length);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
