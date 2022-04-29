// Lib de entrada e saida de dados;
#include <iostream>

// Lib para formatar numero de casas decimais
#include <iomanip>

// Lib para usar funcoes de manipulacao de texto
#include <string>

// Lib universal para nao ter que ficar add cada uma das libs
// #include <bits/stdc++.h>

using namespace std;

int main () {

    int idade;
    double salario, altura;
    char genero;
    string nome;

    idade = 20;
    salario = 5800.0;
    altura = 1.63;
    genero = 'F';
    nome = "Maria Silva";

    // cmd para fixar numero de casas decimais
    cout << fixed << setprecision(2);

    cout << "IDADE = " << idade << endl;
    cout << "SALARIO = " << salario << endl;
    cout << "ALTURA = " << altura << endl;
    cout << "GENERO = " << genero << endl;
    cout << "NOME = " << nome << endl;

    return 0;

}
