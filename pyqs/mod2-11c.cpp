#include <iostream>
#include <string>
using namespace std;

class ECE_faculty;
class CSE_faculty
{
private:
    int highest_degree;

public:
    string name;

    CSE_faculty(int m, string n) : highest_degree(m), name(n) {}

    friend void compare(const CSE_faculty &, const ECE_faculty &);
};

class ECE_faculty
{
private:
    int highest_degree;

public:
    string name;

    ECE_faculty(int m, string n) : highest_degree(m), name(n) {}

    friend void compare(const CSE_faculty &, const ECE_faculty &);
};

void compare(const CSE_faculty &cse, const ECE_faculty &ece)
{
    cout << "Comparing faculty degrees..." << endl;
    if (cse.highest_degree > ece.highest_degree)
        cout << cse.name << " (CSE) has a higher degree." << endl;
    else if (cse.highest_degree < ece.highest_degree)
        cout << ece.name << " (ECE) has a higher degree." << endl;
    else
        cout << "Both have the same highest degree." << endl;
}

int main()
{
    CSE_faculty f1(4, "Dr. Sharma");
    ECE_faculty f2(4, "Dr. Rao");

    compare(f1, f2);

    return 0;
}