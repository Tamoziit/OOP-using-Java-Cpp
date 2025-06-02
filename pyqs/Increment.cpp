#include <iostream>
using namespace std;

class Increment
{
    int value;

public:
    Increment(int v = 0) : value(v) {}

    Increment &operator++()
    {
        ++value;
        return *this;
    }

    Increment operator++(int)
    {
        Increment temp = *this;
        value++;
        return temp;
    }

    void display()
    {
        cout << "value = " << value << endl;
    }
};

int main()
{
    Increment ob(5);
    (++ob).display();
    (ob++).display();
    ob.display();

    return 0;
}