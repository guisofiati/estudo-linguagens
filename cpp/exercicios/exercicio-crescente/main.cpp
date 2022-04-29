#include <iostream>

using namespace std;

int main() {

    int n1, n2;

    cout << "Digite dois numeros:" << endl;
    cin >> n1;
    cin >> n2;

    while (n1 != n2) {

        if (n1 > n2) {
            cout << "DECRESCENTE!" << endl;
        }
        else {
            cout << "CRESCENTE!" << endl;
        }

        cout << "Digite outros dois numeros:" << endl;
        cin >> n1;
        cin >> n2;
    }

    return 0;
}
