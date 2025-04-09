#include <iostream>
using namespace std;

class Animal {
public:
    virtual void sound() { // virtual method
        cout << "Animal makes a sound" << endl;
    }
};

class Animal2 {
public:
    void sound() { // non-virtual method
        cout << "Animal makes a sound in 2" << endl;
    }
};

class Dog : public Animal {
public:
    void sound() override {
        cout << "Dog barks" << endl;
    }
};

class Dog2 : public Animal2 {
public:
    void sound() {
        cout << "Dog barks 2" << endl;
    }
};

int main() {
    Animal* a;
    Animal2* b;
    Dog d;
    Dog2 d2;
    a = &d;
    a->sound(); // Resolved at runtime
    b = &d2;
    b->sound();
    return 0;
}
