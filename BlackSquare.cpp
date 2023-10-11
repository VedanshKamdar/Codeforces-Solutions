#include <iostream>
#include <string>
using namespace std;

int main() {
    int calories[4];
    for (int i = 0; i < 4; i++) {
        cin >> calories[i];
    }
    
    string s;
    cin.ignore();
    getline(cin, s);

    long long sum = 0;
    for (char c : s) {
        int index = c - '1';
        sum += calories[index];
    }

    cout << sum << endl;
    return 0;
}
