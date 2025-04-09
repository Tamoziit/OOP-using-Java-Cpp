#include <iostream>
using namespace std;

class Test
{
public:
    int i;

    Test(int idx)
    {
        i = idx;
        cout << "Object Created: " << i << endl;
    }

    ~Test()
    {
        cout << "Object Destroyed: " << i << endl;
    }
};

int main()
{
    Test t1(1);
    Test t2(2);
    return 0;
}