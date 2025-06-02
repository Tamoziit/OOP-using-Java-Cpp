#include <iostream>
#include <cstring>
#include <exception>
using namespace std;

class test : public exception
{
    char *message;

public:
    test(const char *msg)
    {
        message = new char[strlen(msg) + 1];
        strcpy(message, msg);
    }

    // Override what() to return the message
    const char *what() const noexcept override
    {
        return message;
    }

    ~test()
    {
        delete[] message;
    }
};

int main()
{
    char input[100];
    cout << "Enter" << endl;
    cin >> input;

    try
    {
        if (strcmp(input, "123") == 0)
        {
            throw test("Entered Number");
        }
        else
        {
            cout << "Valid i/p: " << input << endl;
        }
    }
    catch (test &e)
    {
        cout << e.what() << endl;
    }
    return 0;
}