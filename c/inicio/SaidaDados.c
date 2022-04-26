#include <stdio.h>
#include <string.h>

int main () {

    printf("Bom dia");
    printf("Boa tarde");

    printf("Bom dia\n");
    printf("Boa tarde\n");

    printf("--------\n");

    int x, y;

    x = 10;
    y = 20;

    printf("%d\n", x);
    printf("%i\n", y);

    printf("--------\n");

    double z;

    z = 2.3456;

    printf("%.2lf\n", z);

    printf("--------\n");

    int idade;
    double salario;
    char nome[50];
    char sexo;

    idade = 32;
    salario = 4560.0;
    strcpy(nome, "Maria Silva");
    sexo = 'F';

    printf("A funcionaria %s, sexo %c, ganha %.2lf e tem %d anos\n", nome, sexo, salario, idade);

    return 0;
}
