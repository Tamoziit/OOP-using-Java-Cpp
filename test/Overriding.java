// package test;

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

    @Override
    public double getArea() {
        return (22.0/7.0) * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * (22.0/7.0) * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    @Override
    public double getArea()
    {
        return length * breadth;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (length + breadth);
    }
}

class Triangle extends Shape {
    int a, b, c;

    Triangle(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    @Override
    public double getArea()
    {
        double s = (a + b + c) / 2.0;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    @Override
    public double getPerimeter()
    {
        return a + b + c;
    }
}

public class Overriding {
    public static void main(String[] args) {
        Circle c = new Circle(5.3);
        Rectangle r = new Rectangle(5.1, 6.2);
        Triangle t = new Triangle(4, 3, 5);

        System.out.println("For Circle:");
        System.out.println("Area = " + c.getArea());
        System.out.println("Perimeter = " + c.getPerimeter());
        System.out.println("Expenses = Rs. " + c.getExpenses());

        System.out.println("For Rectangle:");
        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());
        System.out.println("Expenses = Rs. " + r.getExpenses());

        System.out.println("For Triangle:");
        System.out.println("Area = " + t.getArea());
        System.out.println("Perimeter = " + t.getPerimeter());
        System.out.println("Expenses = Rs. " + t.getExpenses());
    }
}
