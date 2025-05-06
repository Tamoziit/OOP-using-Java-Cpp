#include <iostream>
using namespace std;

class Rectangle
{
public:
    int length;
    int breadth;

    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }

    int getArea()
    {
        return length * breadth;
    }

    int getPerimeter()
    {
        return 2 * (length + breadth);
    }

    int areDimensionsSame(Rectangle r)
    {
        if (length == r.length && breadth == r.breadth)
            return 1;
        else
            return 0;
    }
};

int main()
{
    int l, b;

    cout << "Enter dimensions for Rectangle 1" << endl;
    cin >> l;
    cin >> b;
    Rectangle ob1(l, b);
    cout << "Enter dimensions for Rectangle 2" << endl;
    cin >> l;
    cin >> b;
    Rectangle ob2(l, b);
    cout << "Enter dimensions for Rectangle 3" << endl;
    cin >> l;
    cin >> b;
    Rectangle ob3(l, b);

    cout << "For Rectangle 1:" << endl;
    cout << "Length = " << ob1.length << endl;
    cout << "Breadth = " << ob1.breadth << endl;
    cout << "Area = " << ob1.getArea() << endl;
    cout << "Perimeter = " << ob1.getPerimeter() << endl;
    if (ob1.areDimensionsSame(ob2))
    {
        cout << "Dimensions of Rectangle 1 & 2 are SAME\n" << endl;
    }
    else
    {
        cout << "Dimensions of Rectangle 1 & 2 are NOT SAME\n" << endl;
    }

    cout << "For Rectangle 2:" << endl;
    cout << "Length = " << ob2.length << endl;
    cout << "Breadth = " << ob2.breadth << endl;
    cout << "Area = " << ob2.getArea() << endl;
    cout << "Perimeter = " << ob2.getPerimeter() << endl;
    if (ob2.areDimensionsSame(ob3))
    {
        cout << "Dimensions of Rectangle 2 & 3 are SAME\n" << endl;
    }
    else
    {
        cout << "Dimensions of Rectangle 2 & 3 are NOT SAME\n" << endl;
    }

    cout << "For Rectangle 3:" << endl;
    cout << "Length = " << ob3.length << endl;
    cout << "Breadth = " << ob3.breadth << endl;
    cout << "Area = " << ob3.getArea() << endl;
    cout << "Perimeter = " << ob3.getPerimeter() << endl;
    if (ob3.areDimensionsSame(ob1))
    {
        cout << "Dimensions of Rectangle 3 & 1 are SAME\n" << endl;
    }
    else
    {
        cout << "Dimensions of Rectangle 3 & 1 are NOT SAME\n" << endl;
    }

    return 0;
}