#include <iostream>
using namespace std;

class Employee
{
public:
    int employee_id;
    string name;
    float salary;

    Employee(int id, string n, float s) : employee_id(id), name(n), salary(s) {}

    void show()
    {
        cout << "Employee Id: " << employee_id << endl;
        cout << "Name: " << name << endl;
        cout << "Salary: " << salary << endl;
    }
};

class Manager
{
public:
    int manager_id;
    string name;
    float salary;

    Manager(int id, string n, float s) : manager_id(id), name(n), salary(s) {}

    void show()
    {
        cout << "Manager Id: " << manager_id << endl;
        cout << "Name: " << name << endl;
        cout << "Salary: " << salary << endl;
    }

    void promote(Employee &emp, float inc)
    {
        emp.salary += inc;
        cout << "Promoted " << emp.name << " Salary to = " << emp.salary << endl;
    }
};

int  main() {
    Employee e1(101, "Alice", 40000);
    Employee e2(102, "Bob", 45000);
    Employee e3(103, "Charlie", 42000);

    Manager m1(201, "Diana", 80000);

    cout << "Initial Employee Details:\n";
    e1.show();
    e2.show();
    e3.show();

    cout << "Manager Details:\n";
    m1.show();

    // Promoting some employees
    m1.promote(e1, 10);
    m1.promote(e3, 15);

    cout << "Updated Employee Details After Promotion:\n";
    e1.show();
    e3.show();

    return 0;
}