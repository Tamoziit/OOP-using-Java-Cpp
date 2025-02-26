#include <iostream>
using namespace std;

class Rectangle
{
public:
    float length;
    float breadth;

    Rectangle(float l, float b)
    {
        length = l;
        breadth = b;
    }

    float area()
    {
        return length * breadth;
    }

    float perimeter()
    {
        return 2 * (length + breadth);
    }

    int same(Rectangle r)
    {
        if (length == r.length && breadth == r.breadth)
            return 1;
        else
            return 0;
    }
};

int main()
{
    Rectangle r1(5, 6), r2(3, 4), r3(5, 6);

    float area = r1.area();
    float perimeter = r1.perimeter();
    int x = r1.same(r2);
    cout << "Area of Rectangle 1 = " << area << endl;
    cout << "Perimeter of Rectangle 1 = " << perimeter << endl;
    if (x)
    {
        cout << "Dimensions of Rectangle 1 is same as Rectangle 2" << endl
             << endl;
    }
    else
    {
        cout << "Dimensions of Rectangle 1 is NOT same as Rectangle 2" << endl
             << endl;
    }

    area = r2.area();
    perimeter = r2.perimeter();
    x = r2.same(r3);
    cout << "Area of Rectangle 2 = " << area << endl;
    cout << "Perimeter of Rectangle 2 = " << perimeter << endl;
    if (x)
    {
        cout << "Dimensions of Rectangle 2 is same as Rectangle 3" << endl
             << endl;
    }
    else
    {
        cout << "Dimensions of Rectangle 2 is NOT same as Rectangle 3" << endl
             << endl;
    }

    area = r3.area();
    perimeter = r3.perimeter();
    x = r3.same(r1);
    cout << "Area of Rectangle 3 = " << area << endl;
    cout << "Perimeter of Rectangle 3 = " << perimeter << endl;
    if (x)
    {
        cout << "Dimensions of Rectangle 3 is same as Rectangle 1" << endl
             << endl;
    }
    else
    {
        cout << "Dimensions of Rectangle 3 is NOT same as Rectangle 1" << endl
             << endl;
    }

    return 0;
}