#include <stdio.h>
#include <string.h>

int main() {

    int idade;
    double salario, altura;
    char nome[50];

    // o & é a referencia de memoria da variavel
    // por padrao em c, um vetor de char ja e uma referencia

    printf("Digite a idade: ");
    scanf("%d", &idade);
    printf("Digite o salario: ");
    scanf("%lf", &salario);
    printf("Digite a altura: ");
    scanf("%lf", &altura);
    printf("Digite o nome: ");
    scanf("%s", nome);

    printf("******\n");
    printf("IDADE: %d\n", idade);
    printf("SALARIO: %.2lf\n", salario);
    printf("ALTURA: %.2lf\n", altura);
    printf("NOME: %s\n", nome);

    return 0;
}
