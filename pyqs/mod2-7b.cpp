#include <iostream>
using namespace std;

void printVal(void *ptr)
{
    cout << "Value = " << *(int *)ptr << endl;
}

int main()
{
    int a = 7;
    printVal((int *)&a);
    return 0;
}