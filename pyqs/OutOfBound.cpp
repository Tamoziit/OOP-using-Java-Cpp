#include <iostream>
#include <cstring>
#include <exception>
using namespace std;

class ArrayIndexOutOfBounException : public exception
{
    int idx;
    char *message;

public:
    ArrayIndexOutOfBounException(int i) : idx(i)
    {
        message = new char[100];
    }

    const char *what() const noexcept override
    {
        strcpy(message, "Array index out of bound");
        return message;
    }

    ~ArrayIndexOutOfBounException()
    {
        delete[] message;
    }
};

int main()
{
    int arr[] = {1, 2, 3, 4};
    int idx;
    cout << "Enter index:";
    cin >> idx;

    try
    {
        if (idx < 0 || idx > 3)
            throw ArrayIndexOutOfBounException(idx);

        cout << "Value = " << arr[idx] << endl;
    }
    catch (const ArrayIndexOutOfBounException& e)
    {
        cout << e.what() << endl;
    }
    return 0;
}