#include <iostream>
#include <cmath>
#include <limits>
#include <vector>
using namespace std;

class Extension1
{
public:
    int getSum(const vector<int> &arr, const vector<int> &choice)
    {
        int i, total = 0;
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
    Extension1 ob;
    int n, ch, i;
    cout << "Enter no. of inputs: ";
    cin >> n;

    vector<int> arr(n);
    vector<int> choice(5);

    cout << "Enter the elements:" << endl;
    for (i = 0; i < n;)
    {
        if (!(cin >> ch))
        {
            cout << "Invalid input. Enter again" << endl;
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
            continue;
        }
        arr[i++] = ch;
    }

    cout << "Choose 5 indices:" << endl;
    for (i = 0; i < 5;)
    {
        if (!(cin >> ch) || ch < 0 || ch >= n)
        {
            cout << "Invalid input. Enter again" << endl;
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
            continue;
        }
        choice[i++] = ch;
    }

    cout << "Inputs: ";
    ob.display(arr);
    cout << "Choices: ";
    ob.display(choice);

    int sum;
    double res;
    sum = ob.getSum(arr, choice);
    res = ob.getSqrtSum(arr, choice);

    cout << "Sum = " << sum << endl;
    cout << "Sqrt Sum = " << res << endl;

    return 0;
}