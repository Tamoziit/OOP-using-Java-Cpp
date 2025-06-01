#include <iostream>
using namespace std;

class BankAcount
{
public:
    int accNo;
    double balance;

    BankAcount(int no, double b) : accNo(no), balance(b) {}

    void display()
    {
        cout << "Account No.: " << accNo << endl;
        cout << "Balance: " << balance << endl;
    }

    void transferByReference(BankAcount &receiver, double amt)
    {
        if (balance >= amt)
        {
            balance -= amt;
            receiver.balance += amt;
        }
        else
        {
            cout << "Transfer failed (Insufficient funds)." << endl;
        }
    }

    void transferByPointer(BankAcount *receiver, double amt)
    {
        if (balance >= amt)
        {
            balance -= amt;
            receiver->balance += amt;
        }
        else
        {
            cout << "Transfer failed (Insufficient funds)." << endl;
        }
    }
};

int main()
{
    BankAcount acc1(101, 1000.0);
    BankAcount acc2(102, 500.0);

    cout << "Initial Account Details:" << endl;
    acc1.display();
    acc2.display();

    // Transfer using reference
    acc1.transferByReference(acc2, 300);

    cout << "\nAfter Transfer (by reference):" << endl;
    acc1.display();
    acc2.display();

    // Transfer using pointer
    acc2.transferByPointer(&acc1, 200);

    cout << "\nAfter Transfer (by pointer):" << endl;
    acc1.display();
    acc2.display();

    return 0;
}