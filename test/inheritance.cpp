#include <iostream>
using namespace std;

class Base
{
public:
    int x;

    Base(int a) : x(a)
    {
        cout << "Base Class Constructor: x = " << x << endl;
    }

    ~Base()
    {
        cout << "Base class Destructor" << endl;
    }
};

class Derived : public Base
{
public:
    int y;

    Derived(int a, int b) : Base(a)
    {
        y = b;
        cout << "Derived Class Constructor: y = " << y << endl;
    }

    ~Derived()
    {
        cout << "Derived class Destructor" << endl;
    }
};


int main() {
    Derived ob(5, 6);
    return 0;
}