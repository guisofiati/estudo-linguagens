#include <iostream>
#include <string>

// Para o arg do cin.ignore funcionar
#include <climits>

using namespace std;

int main () {

    int idade;
    string nome;

    cout << "Digite sua idade: ";
    cin >> idade;
    cout << "Digite seu nome: ";
    cin.ignore(INT_MAX, '\n');     // limpeza de buffer
    getline(cin, nome);            //getline le ate a quebra de linha

    cout << "**********" << endl;
    cout << idade << endl;
    cout << nome << endl;

    return 0;
}
