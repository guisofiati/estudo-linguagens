#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

int main() {

    int N, contador;
    double soma, media, porcentagemMenores;

    cout << "Quantas pessoas serao digitas? ";
    cin >> N;

    string nome[N];
    int idade[N];
    double altura[N];

    soma = 0.0;

    for (int i = 0; i < N; i++) {
        cout << "Dados da " << i+1 << "a pessoa:" << endl;
        cout << "Nome: ";
        cin.ignore(INT_MAX, '\n');
        getline(cin, nome[i]);
        cout << "Idade: ";
        cin >> idade[i];
        cout << "Altura: ";
        cin >> altura[i];

        soma = soma + altura[i];
    }

    media = soma / N;

    cout << fixed << setprecision(2);
    cout << endl;
    cout << "ALTURA MEDIA = " << media << endl;

    contador = 0;

    for (int i = 0; i < N; i++) {
        if (idade[i] < 16) {
            contador++;
        }
    }

    porcentagemMenores = contador * 100.0 / N;

    cout << fixed << setprecision(1);
    cout << "PESSOAS COM MENOS DE 16 ANOS: " << porcentagemMenores << "%" << endl;

    for (int i = 0; i < N; i++) {
        if (idade[i] < 16) {
            cout << nome[i] << endl;
        }
    }

    return 0;
}
