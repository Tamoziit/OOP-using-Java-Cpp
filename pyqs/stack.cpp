#include <iostream>
#include <climits>
#include <cstdlib>
#define MAX 50
using namespace std;

class Stack
{
public:
    int arr[MAX];
    int capacity;
    int stackTop;

    Stack(int cap) : capacity(cap)
    {
        stackTop = -1;
    }

    void push(int item)
    {
        if (stackTop >= capacity)
        {
            cout << "Overflow" << endl;
            return;
        }

        stackTop++;
        arr[stackTop] = item;
    }

    int pop()
    {
        if (stackTop < 0)
        {
            cout << "Underflow" << endl;
            return INT_MIN;
        }

        int ele = arr[stackTop];
        stackTop--;
        return ele;
    }

    void display()
    {
        if (stackTop < 0)
        {
            cout << "Empty List" << endl;
            return;
        }

        int i;
        for (i = 0; i <= stackTop; i++)
        {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

int main()
{
    int cap, item, ele, ch;
    cout << "Enter capacity" << endl;
    cin >> cap;
    Stack stack(cap);

    while (1)
    {
        cout << "1: Push, 2: Pop, 3: Exit" << endl;
        cin >> ch;
        switch (ch)
        {
        case 1:
            cout << "Enter item" << endl;
            cin >> item;
            stack.push(item);
            stack.display();
            break;
        case 2:
            ele = stack.pop();
            if (ele != INT_MIN)
                cout << "Popped: " << ele << endl;
            stack.display();
            break;
        case 3:
            cout << "EOF" << endl;
            exit(0);
        default:
            cout << "Wrong Choice!" << endl;
        }
    }

    return 0;
}