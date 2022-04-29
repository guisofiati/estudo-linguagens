#include <iostream>

using namespace std;

int main () {

    int x, soma;

    cout << "Digite o primeiro numero: ";
    cin >> x;

    soma = 0;

    while (x != 0) {
        soma = soma + x;

        cout << "Digite outro numero: ";
        cin >> x;
    }

    cout << "SOMA = " << soma << endl;

    return 0;
}
