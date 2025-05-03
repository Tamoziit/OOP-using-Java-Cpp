#include <iostream>
#include <stdexcept>

using namespace std;

int main()
{
    double temp;
    cout << "Enter Room Temperature: ";

    try
    {
        cin >> temp;

        if (!cin)
        {
            throw runtime_error("Invalid input. Please enter a numeric value.");
        }

        if (temp < 18.0)
        {
            throw runtime_error("Room temperature is too low");
        }
        else if (temp > 28.0)
        {
            throw runtime_error("Room temperature is too high");
        }
        else
        {
            cout << "Valid Room Temperature: " << temp << endl;
        }
    }
    catch (const runtime_error &e)
    {
        cout << e.what() << endl;
    }

    return 0;
}
