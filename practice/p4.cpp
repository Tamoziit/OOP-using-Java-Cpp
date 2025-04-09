#include <iostream>
using namespace std;

class MyClass
{
private:
    static int count; // static variable to track number of objects

public:
    // Constructor
    MyClass()
    {
        count++;
        cout << "Object created. Total alive: " << count << endl;
    }

    // Destructor
    ~MyClass()
    {
        count--;
        cout << "Object destroyed. Total alive: " << count << endl;
    }

    // Static function to access count
    static int getCount()
    {
        return count;
    }
};

// Initialize static variable outside the class
int MyClass::count = 0;

int main()
{
    MyClass obj1;
    {
        MyClass obj2, obj3;
        cout << "Currently alive: " << MyClass::getCount() << endl;
    } // obj2 and obj3 go out of scope here

    cout << "Currently alive after block: " << MyClass::getCount() << endl;

    return 0;
}