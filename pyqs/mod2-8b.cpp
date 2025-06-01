#include <iostream>
#include <climits>
#include <cstdlib>
#define MAX 50
using namespace std;

class Queue
{
public:
    int arr[MAX];
    int capacity;
    int rear, front;

    Queue(int cap) : capacity(cap)
    {
        rear = -1;
        front = -1;
    }

    void enqueue(int item)
    {
        if (rear == capacity-1)
        {
            cout << "Overflow" << endl;
            return;
        }

        if (front == -1)
            front++;
        rear++;
        arr[rear] = item;
    }

    int dequeue()
    {
        if (front == -1 || front > rear)
        {
            cout << "Underflow" << endl;
            return INT_MIN;
        }

        int ele = arr[front];
        front++;

        // Reset queue if all elements are removed
        if (front > rear)
            front = rear = -1;

        return ele;
    }

    void display()
    {
        if (front == -1 || front > rear)
        {
            cout << "Queue is empty" << endl;
            return;
        }

        cout << "Queue: ";
        for (int i = front; i <= rear; i++)
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
    Queue queue(cap);

    while (1)
    {
        cout << "1: Enqueue, 2: Dequeue, 3: Exit" << endl;
        cin >> ch;
        switch (ch)
        {
        case 1:
            cout << "Enter item" << endl;
            cin >> item;
            queue.enqueue(item);
            queue.display();
            break;
        case 2:
            ele = queue.dequeue();
            if (ele != INT_MIN)
                cout << "Popped: " << ele << endl;
            queue.display();
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