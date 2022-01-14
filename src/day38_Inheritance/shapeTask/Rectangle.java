package day38_Inheritance.shapeTask;

public class Rectangle extends Shape  {

    public double l, w;

    public Rectangle( double l, double w) {
        super("Rectangle");
        this.l = l;
        this.w = w;
    }

    public double area() {
        return l*w;
    }

    public double perimeter() {
        return 2*(l+w);
    }

    public String toString() {
        return super.toString()
                +"\n length= " + l
                + "\n width= "+ w ;
    }
}
/*
Rectangle
	l
	w

	toString(): name, l, w, area, perimeter

 */