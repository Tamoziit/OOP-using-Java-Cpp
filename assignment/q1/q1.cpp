#include <iostream>
#include <iostream>
#include <vector>
#include <cmath>
#include <limits>

using namespace std;

class Q1
{
public:
    int getSum(const vector<int> &arr, const vector<int> &choice)
    {
        int total = 0, i;
        for (i = 0; i < choice.size(); i++)
        {
            total += arr[choice[i]];
        }
        return total;
    }

    double getSqrtSum(const vector<int> &arr, const vector<int> &choice)
    {
        int i;
        double total = 0.0;
        for (i = 0; i < choice.size(); i++)
        {
            total += sqrt(arr[choice[i]]);
        }
        return total;
    }

    void display(const vector<int> &arr)
    {
        int i;
        for (i = 0; i < arr.size(); i++)
        {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

int main()
{
    Q1 ob;
    int n, ch;
    cout << "Enter no. of inputs: ";
    cin >> n;

    vector<int> arr(n);
    vector<int> choice(5);

    cout << "Enter Elements:\n";
    for (int i = 0; i < n;)
    {
        if (!(cin >> ch))
        {
            cout << "Input is not in a valid format. Enter Again!" << endl;
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
            continue;
        }
        arr[i++] = ch;
    }

    cout << "Choose 5 indices:\n";
    for (int i = 0; i < 5;)
    {
        if (!(cin >> ch) || ch < 0 || ch >= n)
        {
            cout << "Invalid Index. Enter Again!" << endl;
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
            continue;
        }
        choice[i++] = ch;
    }

    cout << "Inputs:" << endl;
    ob.display(arr);

    cout << "Choices:" << endl;
    ob.display(choice);

    int res1 = ob.getSum(arr, choice);
    double res2 = ob.getSqrtSum(arr, choice);

    cout << "Sum = " << res1 << endl;
    cout << "Sqrt Sum = " << res2 << endl;

    return 0;
}