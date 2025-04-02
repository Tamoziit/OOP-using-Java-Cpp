// package java.functionOverriding;
import java.util.Scanner;

class Shape {
    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    public double getExpenses() {
        return getArea() * 30.0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return (22.0 / 7.0) * radius * radius;
    }

    public double getPerimeter() {
        return 2.0 * (22.0 / 7.0) * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    public double getArea() {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    public double getPerimeter() {
        return a + b + c;
    }
}

public class Overriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println("Enter Radius for Circle:");
        r = sc.nextDouble();
        Circle ci = new Circle(r);
        System.out.println("Area = " + ci.getArea());
        System.out.println("Perimeter = " + ci.getPerimeter());
        System.out.println("Expenses = " + ci.getExpenses() + "\n");

        double l, br;
        System.out.println("Enter Length & Breadth for Rectangle:");
        l = sc.nextDouble();
        br = sc.nextDouble();
        Rectangle rec = new Rectangle(l, br);
        System.out.println("Area = " + rec.getArea());
        System.out.println("Perimeter = " + rec.getPerimeter());
        System.out.println("Expenses = " + rec.getExpenses() + "\n");

        double a, b, c;
        System.out.println("Enter the dimensions of the Triangle:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        Triangle t = new Triangle(a, b, c);
        System.out.println("Area = " + t.getArea());
        System.out.println("Perimeter = " + t.getPerimeter());
        System.out.println("Expenses = " + t.getExpenses() + "\n");

        sc.close();
    }
}
