import shape.Circle;
import shape.Rectangle;
import shape.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle: Area = " + c.area() + ", Perimeter = " + c.perimeter());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Rectangle: Area = " + r.area() + ", Perimeter = " + r.perimeter());

        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Triangle: Area = " + t.area() + ", Perimeter = " + t.perimeter());
    }
}
