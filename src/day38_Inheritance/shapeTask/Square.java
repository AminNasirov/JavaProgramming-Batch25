package day38_Inheritance.shapeTask;

public class Square extends Shape {

    public double side;

    public Square( double side) {
        super("Square");
        this.side = side;
    }

    public double area() {
        return side*side;
    }

    public double perimeter() {
        return 4*side;
    }

    public String toString() {
        return super.toString()
                +"\n side= " + side;
    }
}
/*
Square
	s

	toString(): name, s, area, perimeter
 */