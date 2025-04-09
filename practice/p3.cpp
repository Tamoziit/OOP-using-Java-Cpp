#include <iostream>
using namespace std;

class test
{
public:
    test() { cout << "Cons" << endl; }
    ~test() { cout << "Dest" << endl; }
};

int main()
{
    for (int i = 0; i < 2; i++)
        test obj;
    return 0;
}