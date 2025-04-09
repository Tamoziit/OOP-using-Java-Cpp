#include <iostream>
using namespace std;

int main() {
    void *ptr;
    int x = 6;
    ptr = &x;

    // Print int
    cout << "Value of x: " << *((int *)ptr) << endl;

    // Reassign ptr to a char array
    char str[] = "Hello, world!";
    ptr = str; // now ptr points to char array

    // Print char array
    cout << "Character array: " << (char *)ptr << endl;

    return 0;
}
