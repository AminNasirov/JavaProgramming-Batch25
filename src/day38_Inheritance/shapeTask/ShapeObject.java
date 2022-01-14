package day38_Inheritance.shapeTask;

public class ShapeObject {
    public static void main(String[] args) {

      Circle circle = new Circle(2.5);
      circle.setRadius(circle.getRadius()*3);



      Square square = new Square(10);
      square.setSide(20);



      Rectangle rectangle = new Rectangle(2,3);
      rectangle.setL(rectangle.getL()+10);


        System.out.println(rectangle);
        System.out.println(rectangle.getName());
        System.out.println(rectangle.getL());

        System.out.println(square);


        System.out.println(circle);
        System.out.println(circle.getRadius());
        System.out.println(circle.pi);

    }
}
