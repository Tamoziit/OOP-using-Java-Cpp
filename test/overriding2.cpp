// Approach 2
#include <iostream>
#include <cmath>
using namespace std;

class Shape
{
public:
    virtual ~Shape() = default;

    virtual double getArea() const
    {
        return 0.0;
    }

    virtual double getPerimeter() const
    {
        return 0.0;
    }

    double getExpenses() const
    {
        return getArea() * 30.0;
    }
};

class Circle : public Shape
{
public:
    double radius;
    Circle(double r) : radius(r) {}

    double getArea() const override
    {
        return M_PI * radius * radius;
    }

    double getPerimeter() const override
    {
        return 2 * M_PI * radius;
    }
};

class Rectangle : public Shape
{
public:
    double length, breadth;
    Rectangle(double l, double b) : length(l), breadth(b) {}

    double getArea() const override
    {
        return length * breadth;
    }

    double getPerimeter() const override
    {
        return 2 * (length + breadth);
    }
};

class Triangle : public Shape
{
public:
    double a, b, c;
    Triangle(double x, double y, double z) : a(x), b(y), c(z) {}

    double getArea() const override
    {
        double s = (a + b + c) / 2.0;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double getPerimeter() const override
    {
        return a + b + c;
    }
};

int main()
{
    Circle c(5.3);
    Rectangle r(2, 8);
    Triangle t(3, 4, 5);

    cout << "For Circle:\n"
         << "  Area      = " << c.getArea() << "\n"
         << "  Perimeter = " << c.getPerimeter() << "\n"
         << "  Expense   = Rs." << c.getExpenses() << "\n\n";

    cout << "For Rectangle:\n"
         << "  Area      = " << r.getArea() << "\n"
         << "  Perimeter = " << r.getPerimeter() << "\n"
         << "  Expense   = Rs." << r.getExpenses() << "\n\n";

    cout << "For Triangle:\n"
         << "  Area      = " << t.getArea() << "\n"
         << "  Perimeter = " << t.getPerimeter() << "\n"
         << "  Expense   = Rs." << t.getExpenses() << "\n";

    return 0;
}
