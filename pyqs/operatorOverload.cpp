#include <iostream>
using namespace std;

class operatorOverload
{
    int i;

public:
    friend istream &operator>>(istream &in, operatorOverload &t);
    friend ostream &operator<<(ostream &out, operatorOverload &t);
};

istream &operator>>(istream &in, operatorOverload &t)
{
    in >> t.i;
    return in;
}

ostream &operator<<(ostream &out, operatorOverload &t)
{
    out << t.i;
    return out;
}

int main()
{
    operatorOverload obj;
    cout << "Enter input" << endl;
    cin >> obj;
    cout << obj;
    return 0;
}