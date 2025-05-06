#include <iostream>
using namespace std;

class Complex
{
public:
    int real, imaginary;

    Complex(int r, int i)
    {
        this->real = r;
        this->imaginary = i;
    }

    Complex getSum(Complex a)
    {
        Complex res(0, 0);
        res.real = this->real + a.real;
        res.imaginary = this->imaginary + a.imaginary;
        return res;
    }

    Complex getMultiplication(Complex a)
    {
        Complex res(0, 0);

        // (a + ib)(c + id) = (ac - bd) + i(bc + ad)
        res.real = (this->real * a.real) - (this->imaginary * a.imaginary);
        res.imaginary = (this->imaginary * a.real) + (this->real * a.imaginary);
        return res;
    }

    void display()
    {
        cout << "(" << this->real << ") + (" << this->imaginary << ")i" << endl;
    }
};

int main()
{
    Complex num1(3, 5);
    Complex num2(5, 9);
    Complex res1(0, 0);
    Complex res2(0, 0);

    cout << "Num 1 = ";
    num1.display();
    cout << "Num 2 = ";
    num2.display();

    res1 = num1.getSum(num2);
    res2 = num1.getMultiplication(num2);

    cout << "Addition = ";
    res1.display();
    cout << "Multiplication = ";
    res2.display();

    return 0;
}