#include <iostream>
#include <string>
using namespace std;

template <typename T>
T add(T a, T b)
{
    return a + b;
}

template <>
string add<string>(string a, string b)
{
    return a + b;
}

int main()
{
    cout << "Int Addition: " << add(1, 2) << endl;
    cout << "Float Addition: " << add(1.3, 5.6) << endl;
    cout << "String: " << add<string>("Hello ", "World") << endl;

    return 0;
}