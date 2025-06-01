#include <iostream>
#include <string>
using namespace std;

class Demo
{
public:
    string name;

    // Constructor
    Demo(string n) : name(n)
    {
        cout << "Constructing " << name << endl;
    }

    // Destructor
    ~Demo()
    {
        cout << "Destructing " << name << endl;
    }
};

Demo globalObj("Global Object"); // global object

void f()
{
    Demo funcObj("Object in f()"); // function object
}

int main()
{
    cout << "Inside main" << endl;

    static Demo staticObj("Static Object"); // static object
    Demo("Nameless Object");                // nameless object
    Demo localMainObj("Local Main Object"); // local object
    {
        Demo blockObj("Block Object"); // block object
    }
    f();

    cout << "Exiting main" << endl;
    return 0;
}