#include <iostream>
using namespace std;

class TIME
{
public:
    int hour, minute, second;

    TIME(int h, int m, int s)
    {
        hour = h;
        minute = m;
        second = s;
    }

    void display()
    {
        cout << hour << ":" << minute << ":" << second << endl;
    }

    TIME add(TIME ob)
    {
        TIME temp(0, 0, 0);

        temp.second = this->second + ob.second;
        temp.minute = this->minute + ob.minute;
        temp.hour = this->hour + ob.hour;

        if (temp.second >= 60)
        {
            temp.second -= 60;
            temp.minute += 1;
        }

        if (temp.minute >= 60)
        {
            temp.minute -= 60;
            temp.hour += 1;
        }

        return temp;
    }
};

int main()
{
    int h1, h2;
    int m1, m2;
    int s1, s2;

    cout << "Enter time 1" << endl;
    cin >> h1;
    cin >> m1;
    cin >> s1;
    cout << "Enter time 2" << endl;
    cin >> h2;
    cin >> m2;
    cin >> s2;

    TIME t1(h1, m1, s1);
    TIME t2(h2, m2, s2);
    t1.display();
    t2.display();

    TIME res(0, 0, 0);
    res = t1.add(t2);
    cout << "Result:" << endl;
    res.display();
    return 0;
}