#include <iostream>
using namespace std;

class Base
{
public:
    int x;

    Base(int a) : x(a) // Constructor alt. syntax
    {
        cout << "Base Class Constructor: x = " << x << endl;
    }

    ~Base() // Destructor
    {
        cout << "Destructor of Base Class" << endl;
    }
};

class Derived : public Base
{
public:
    int y;

    Derived(int a, int b) : Base(a)
    {
        y = b;
        cout << "Derived Class Constructor: x = " << x << " y = " << y << endl;
    }

    ~Derived()
    {
        cout << "Destructor of Derived Class" << endl;
    }
};

int main()
{
    Derived d(10, 20);
    return 0;
}