#include <iostream>
using namespace std;

class A
{
    int x;

public:
    A() { cout << "Object created" << endl; }
    A(int a)
    {
        x = a;
        cout << "Object created" << endl;
    }
    ~A()
    {
        cout << "Object destroyed" << endl;
    }
};

int main()
{
    A *s = new A[5];
    int i;
    for (i = 0; i < 5; i++)
        s[i] = A(i);
    delete[] s;
    return 0;
}