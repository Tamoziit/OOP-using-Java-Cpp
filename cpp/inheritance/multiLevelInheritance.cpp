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

class Exam : public Student
{
public:
    int marks[4];

    Exam() {}

    Exam(string n, long r, int *arr) : Student(n, r)
    {
        int i;
        for (i = 0; i < 4; i++)
        {
            marks[i] = arr[i];
        }
    }

    int getSum()
    {
        int i, total = 0;
        for (i = 0; i < 4; i++)
        {
            total += marks[i];
        }

        return total;
    }
};

class Result : public Exam
{
public:
    char grade;

    Result(string n, long r, int *arr) : Exam(n, r, arr)
    {
        grade = 'F';
    }

    char getGrade()
    {
        float percentage = (getSum() / 400.0) * 100.0;

        if (percentage >= 90.0)
            return 'O';
        else if (percentage >= 80.0 && percentage < 90.0)
            return 'A';
        else if (percentage >= 70.0 && percentage < 80.0)
            return 'B';
        else if (percentage >= 60.0 && percentage < 70.0)
            return 'C';
        else if (percentage >= 50.0 && percentage < 60.0)
            return 'D';
        else if (percentage >= 40.0 && percentage < 50.0)
            return 'E';
        else
            return 'F';
    }
};

int main()
{
    string name;
    long rollNo;
    int marks[4], i;

    cout << "Enter name:" << endl;
    getline(cin, name);
    cout << "Enter roll no.:" << endl;
    cin >> rollNo;
    cout << "Enter marks of 4 subjects:" << endl;
    for (i = 0; i < 4; i++)
    {
        cin >> marks[i];
    }

    Result ob(name, rollNo, marks);
    ob.displayDetails();
    char grade = ob.getGrade();
    cout << "Grade: " << grade << endl;

    return 0;
}