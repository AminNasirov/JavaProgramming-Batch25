package day38_Inheritance.shapeTask;

public class Rectangle extends Shape  {

    private double l, w;

    public double getL() {
        return l;
    }

    public void setL(double l) {
        if(l<=0){
            System.err.println("Invalid Length: "+l);
            System.exit(1);
        }
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        if(w<=0){
            System.err.println("Invalid width: "+w);
            System.exit(1);
        }
        this.w = w;
    }

    public Rectangle(double l, double w) {
        super("Rectangle");
        setL(l);
        setW(w);
    }

    public double area() {
        return l*w;
    }

    public double perimeter() {
        return 2*(l+w);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "l=" + l +
                ", w=" + w +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Rectangle
	l
	w

	toString(): name, l, w, area, perimeter

 */