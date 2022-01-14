package day38_Inheritance.shapeTask;

public class ShapeObject {
    public static void main(String[] args) {

      Circle circle = new Circle(2.5);
      circle.area();
      circle.perimeter();

      Square square = new Square(4);
      square.area();
      square.perimeter();


      Rectangle rectangle = new Rectangle(2,3);
      rectangle.area();
      rectangle.perimeter();

        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);

    }
}
