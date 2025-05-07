#include <iostream>
#include <cmath>
using namespace std;

class Shape
{
public:
    double getArea()
    {
        return 0.0;
    }

    double getPerimeter()
    {
        return 0.0;
    }

    double getExpenses()
    {
        return getArea() * 30.0;
    }
};

class Circle : public Shape
{
public:
    double radius;

    Circle(int r) : radius(r) {}

    double getArea()
    {
        return M_PI * radius * radius;
    }

    double getPerimeter()
    {
        return 2 * M_PI * radius;
    }

    double getExpenses()
    {
        return getArea() * 30.0;
    }
};

class Rectangle : public Shape
{
public:
    double length, breadth;

    Rectangle(int l, int b) : length(l), breadth(b) {}

    double getArea()
    {
        return length * breadth;
    }

    double getPerimeter()
    {
        return 2 * (length + breadth);
    }

    double getExpenses()
    {
        return getArea() * 30.0;
    }
};

class Triangle : public Shape
{
public:
    double a, b, c;

    Triangle(int x, int y, int z) : a(x), b(y), c(z) {}

    double getArea()
    {
        double s = (a + b + c) / 2.0;

        double area = sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    double getPerimeter()
    {
        return a + b + c;
    }

    double getExpenses()
    {
        return getArea() * 30.0;
    }
};

int main()
{
    Circle c(5.3);
    Rectangle r(2, 8);
    Triangle t(3, 4, 5);

    cout << "For Circle:" << endl;
    cout << "Area = " << c.getArea() << endl;
    cout << "Perimeter = " << c.getPerimeter() << endl;
    cout << "Expense = Rs." << c.getExpenses() << endl;

    cout << "For Rectangle:" << endl;
    cout << "Area = " << r.getArea() << endl;
    cout << "Perimeter = " << r.getPerimeter() << endl;
    cout << "Expense = Rs." << r.getExpenses() << endl;

    cout << "For Triangle:" << endl;
    cout << "Area = " << t.getArea() << endl;
    cout << "Perimeter = " << t.getPerimeter() << endl;
    cout << "Expense = Rs." << t.getExpenses() << endl;

    return 0;
}