#include <iostream>
using namespace std;

class Friend;

class A
{
    int data1;

    A(int x) : data1(x) {}

    friend Friend;
};

class B
{
    int data2;

    B(int x) : data2(x) {}

    friend Friend;
};

class Friend
{
public:
    int add()
    {
        A ob1(10);
        B ob2(20);

        return ob1.data1 + ob2.data2;
    }
};

int main()
{
    Friend ob;
    cout << "Result = " << ob.add() << endl;
    return 0;
}