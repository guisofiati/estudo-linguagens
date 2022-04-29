#include <iostream>

using namespace std;

int main () {

    int N, X, soma;

    cout << "Quantos numeros serao digitados? ";
    cin >> N;

    soma = 0;

    for (int i = 1; i <= N; i++) {
        cout << "Digite um numero: ";
        cin >> X;

        soma = soma + X;
    }

    cout << "SOMA = " << soma << endl;

    return 0;
}
