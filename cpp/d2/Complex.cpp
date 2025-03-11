#include <iostream>
using namespace std;

class Complex
{
public:
    float real;
    float complex;

    Complex(float r, float c)
    {
        this->real = r;
        this->complex = c;
    }

    Complex add(Complex a)
    {
        Complex res(0, 0);
        res.real = real + a.real;
        res.complex = complex + a.complex;
        return res;
    }

    Complex multiply(Complex a)
    {
        Complex res(0, 0);
        res.real = (real * a.real) - (complex * a.complex);
        res.complex = (real * a.complex) + (complex * a.real);
        return res;
    }

    void display()
    {
        cout << "(" << real << ") + (" << complex << ")i" << endl;
    }
};

int main()
{
    Complex testCases[][2] = {
        {Complex(3, 2), Complex(1, 4)},
        {Complex(-2, 5), Complex(3, -7)},
        {Complex(0, 0), Complex(0, 0)},
        {Complex(5, 0), Complex(0, 6)},
        {Complex(2.5, -1.5), Complex(-3.5, 2.5)}};

    for (int i = 0; i < 5; i++)
    {
        Complex num1 = testCases[i][0];
        Complex num2 = testCases[i][1];

        Complex resultAdd = num1.add(num2);
        Complex resultMul = num1.multiply(num2);

        cout << "Test Case " << i + 1 << ":" << endl;
        cout << "Addition: ";
        resultAdd.display();
        cout << "Multiplication: ";
        resultMul.display();
        cout << "------------------" << endl;
    }

    return 0;
}