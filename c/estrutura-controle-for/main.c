#include <stdio.h>
#include <stdlib.h>

int main() {

    int N, X, i, soma;

    soma = 0;

    printf("Quantos numeros serao digitados? ");
    scanf("%d", &N);

    for (i = 1; i <= N; i++) {
        printf("Digite um numero: ");
        scanf("%d", &X);
        soma = soma + X;
    }

    printf("******\n");
    printf("SOMA = %d\n", soma);

    return 0;
}
