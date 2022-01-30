package day33_Statics;

public class CircleObjects {

    public static void main(String[] args){

        Circle circle1 = new Circle(5,12);

        System.out.println(circle1);
        circle1.printPi();



        System.out.println(circle1.pi);

        circle1.radius=6;
        System.out.println(circle1);

        Circle.pi=6;

        System.out.println(circle1.pi);

        System.out.println(Circle.pi);

        Circle.printPi();
        System.out.println(circle1.calcArea(5));





    }
}
