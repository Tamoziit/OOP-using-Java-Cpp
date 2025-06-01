#include<iostream>
using namespace std;

int x = 40;

int& setx() { return x; }

int main() {
    //setx();
    setx() = 22;
    cout << "x=" << x << endl;
    return 0;
}