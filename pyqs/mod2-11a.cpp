#include <iostream>
#include <cstring>
using namespace std;

int main()
{
    char s1[6] = "Hello";
    char s2[6] = "World";
    char s3[12]; // Enough space for "Hello World" + '\0'

    strcpy(s3, s1);  // Copy "Hello" into s3
    strcat(s3, " "); // Concatenate space
    strcat(s3, s2);  // Concatenate "World"

    cout << s3 << endl; // Output: Hello World
    return 0;
}
