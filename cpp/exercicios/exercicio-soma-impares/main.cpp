#include <iostream>

using namespace std;

int main() {

    int X, Y, soma, temp;

    cout << "Digite dois numeros:" << endl;
    cin >> X;
    cin >> Y;

    if (X > Y) {
        temp = X;
        X = Y;
        Y = temp;
    }

    soma = 0;

    for (int i = X+1; i < Y; i++) {
        if (i % 2 != 0) {
           soma = soma + i;
        }
    }

    cout << endl;
    cout << "SOMA DOS IMPARES = " << soma << endl;

    return 0;
}
