#include <iostream>
using namespace std;

class test
{
    int var;

public:
    test()
    {
        var = 0;
        cout << var << endl;
    }
    test(int a)
    {
        var = a;
        cout << var << endl;
    }
};

int main()
{
    test obj;
}