#include <iostream>
#include <string>
using namespace std;

class Student
{
public:
    string name;
    long rollNo;

    Student() {}

    Student(string n, long r)
    {
        name = n;
        rollNo = r;
    }

    void displayDetails()
    {
        cout << "Name: " << name << endl;
        cout << "Roll No.: " << rollNo << endl;
    }
};

class Exam : virtual public Student
{
public:
    int marks[5];

    Exam() {}

    Exam(string n, long r, int *arr) : Student(n, r)
    {
        int i;
        for (i = 0; i < 5; i++)
        {
            marks[i] = arr[i];
        }
    }

    int getSum()
    {
        int total = 0, i;
        for (i = 0; i < 5; i++)
        {
            total += marks[i];
        }

        return total;
    }
};

class MARPoints : virtual public Student
{
public:
    int totalPoints;

    MARPoints() {}

    MARPoints(string n, long r, int p) : Student(n, r)
    {
        totalPoints = p;
    }
};

class Result : public Exam, public MARPoints
{
public:
    Result(string n, long r, int *arr, int p)
        : Student(n, r), Exam(n, r, arr), MARPoints(n, r, p) {}

    void getResult()
    {
        int total = getSum();

        if (totalPoints < 100)
        {
            cout << "Fail" << endl;
            return;
        }
        if (total < 40)
        {
            cout << "Fail" << endl;
            return;
        }
        else
        {
            cout << "Pass" << endl;
            return;
        }
    }
};

int main()
{
    string name;
    long rollNo;
    int marks[5], totalPoints, i;

    cout << "Enter name:" << endl;
    getline(cin, name);
    cout << "Enter roll no.:" << endl;
    cin >> rollNo;
    cout << "Enter marks of 5 subjects:" << endl;
    for (i = 0; i < 5; i++)
    {
        cin >> marks[i];
    }
    cout << "Enter MAR Points:" << endl;
    cin >> totalPoints;

    Result ob(name, rollNo, marks, totalPoints);
    ob.displayDetails();
    ob.getResult();

    return 0;
}