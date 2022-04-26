#include <stdio.h>
#include <string.h>

int main () {

    int idade;
    float salario, altura;
    char genero;

    // Array de 50 posicoes
    char nome[50];

    // Atribuicao direta:
    // int idade = 20;
    // char nome[50] = "Maria Silva"

    idade = 20;
    salario = 4200.0;
    altura = 1.68;
    genero = 'F';

    // Uma funcao da lib string.h
    strcpy(nome, "Maria Silva");

    printf("IDADE = %d\n", idade);
    printf("SALRIO = %.2lf\n", salario);
    printf("ALTURA = %.2lf\n", altura);
    printf("GENERO = %c\n", genero);
    printf("NOME = %s\n", nome);

    return 0;
}
