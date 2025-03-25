#include <iostream>
#include <cmath>
using namespace std;

class Shape
{
public:
    double getPerimeter()
    {
        return 0;
    }

    double getArea()
    {
        return 0;
    }

    double findExpenses()
    {
        return getArea() * 30;
    }
};

class Circle : public Shape
{
public:
    double radius;

    Circle(double r) : radius(r) {}

    double getPerimeter()
    {
        return 2 * M_PI * radius;
    }

    double getArea()
    {
        return M_PI * radius * radius;
    }

    double findExpenses()
    {
        return getArea() * 30;
    }
};

class Rectangle : public Shape
{
public:
    double length, breadth;

    Rectangle(double l, double b) : length(l), breadth(b) {}

    double getPerimeter()
    {
        return 2 * (length + breadth);
    }

    double getArea()
    {
        return (length * breadth);
    }

    double findExpenses()
    {
        return getArea() * 30;
    }
};

class Triangle : public Shape
{
public:
    double a, b, c;

    Triangle(double x, double y, double z) : a(x), b(y), c(z) {}

    double getPerimeter()
    {
        return a + b + c;
    }

    double getArea()
    {
        double s = getPerimeter() / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    double findExpenses()
    {
        return getArea() * 30;
    }
};

int main()
{
    Circle circle(5);
    Rectangle rectangle(4, 6);
    Triangle triangle(3, 4, 5);

    cout << "Circle: \n";
    cout << "Perimeter: " << circle.getPerimeter() << " units\n";
    cout << "Area: " << circle.getArea() << " square units\n";
    cout << "Coloring Expense: Rs. " << circle.findExpenses() << "\n\n";

    cout << "Rectangle: \n";
    cout << "Perimeter: " << rectangle.getPerimeter() << " units\n";
    cout << "Area: " << rectangle.getArea() << " square units\n";
    cout << "Coloring Expense: Rs. " << rectangle.findExpenses() << "\n\n";

    cout << "Triangle: \n";
    cout << "Perimeter: " << triangle.getPerimeter() << " units\n";
    cout << "Area: " << triangle.getArea() << " square units\n";
    cout << "Coloring Expense: Rs. " << triangle.findExpenses() << "\n";

    return 0;
}