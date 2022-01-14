package day38_Inheritance.shapeTask;

public class Circle extends Shape {

    public double radius;
    public static double pi = 3.14;

    public Circle( double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double area() {
        return pi*radius*radius;
    }

    public double perimeter() {
        return 2*pi*radius;
    }


    public String toString() {
        return super.toString() +
                "\n radius=" + radius;
    }
}
/*
Circle
	r
	pi

	toString(): name, r, pi, area, perimeter
 */
