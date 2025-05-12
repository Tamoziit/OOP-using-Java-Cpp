#include<iostream>
#include<stdexcept>
using namespace std;

class Exception2 {
    public:
        int temp;

        void getRes() {
            try
            {
                cout << "Enter temp" << endl;
                cin >> temp;
                if(!cin) {
                    throw runtime_error("Invalid input");
                }

                if(temp < 18) {
                    throw runtime_error("temp too low");
                } else if(temp > 28) {
                    throw runtime_error("temp too high");
                } else {
                    cout << "valid temp = " << temp << endl;
                }
            }
            catch(const runtime_error &e)
            {
                cout << e.what() << endl;
            }
            
        }
};

int main() {
    Exception2 ob;
    ob.getRes();
    return 0;
}