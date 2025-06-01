#include <iostream>
using namespace std;

class Complex
{
public:
    int real, img;

    void getData()
    {
        cout << "Enter No." << endl;
        cin >> real;
        cin >> img;
    }

    void showData()
    {
        cout << "(" << real << ") + (" << img << ")i" << endl;
    }

    Complex addComplex(Complex ob)
    {
        Complex temp;
        temp.real = this->real + ob.real;
        temp.img = this->img + ob.img;

        return temp;
    }
};

int main()
{
    Complex num1;
    Complex num2;

    num1.getData();
    num2.getData();
    num1.showData();
    num2.showData();

    Complex res;
    res = num1.addComplex(num2);
    res.showData();

    return 0;
}