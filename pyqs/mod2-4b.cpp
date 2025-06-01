#include <iostream>
using namespace std;

class Solution
{
public:
    double n;
    int p;

    Solution(double x, int y) : n(x), p(y) {}

    double power(int p = 2)
    {
        if (p == 0)
            return 1;
        else
            return n * power(p - 1);
    }
};

int main()
{
    double n;
    int p;

    cout << "Enter Number = ";
    cin >> n;
    cout << "Enter exponent = ";
    cin >> p;
    Solution obj(n, p);
    cout << "Result = " << obj.power(p) << endl;
    cout << "Default Result = " << obj.power() << endl;
    return 0;
}