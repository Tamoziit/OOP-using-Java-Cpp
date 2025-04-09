#include <iostream>
using namespace std;

void updateByReference(int &x)
{
    cout << &x << " : " << x << endl;
    x += 10;
}

void updateByAddress(int *x)
{
    cout << x << " : " << *x << endl;
    *x += 10;
}

int main()
{
    int a = 5;
    updateByReference(a);
    cout << "a after updateByReference: " << a << endl;
    updateByAddress(&a);
    cout << "a after updateByAddress: " << a << endl;
    return 0;
}
