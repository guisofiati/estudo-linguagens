#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

void ler_texto(char *buffer, int length) {
    fgets(buffer, length, stdin);
    strtok(buffer, "\n");
}

int main() {

    int N, contador;
    double media, soma, porcentagemMenor;

    printf("Quantas pessoas serao digitadas? ");
    scanf("%d", &N);

    char nome[N][50];
    int idade[N];
    double altura[N];

    for (int i = 0; i < N; i++) {
        printf("Dados da %da pessoa:\n", i+1);
        printf("Nome: ");
        limpar_entrada();
        ler_texto(nome[i], 50);
        printf("Idade: ");
        scanf("%d", &idade[i]);
        printf("Altura: ");
        scanf("%lf", &altura[i]);
    }

    soma = 0.0;

    for (int i = 0; i < N; i++) {
        soma = soma + altura[i];
    }

    media = soma / N;

    printf("\nALTURA MEDIA = %.2lf\n", media);

    contador = 0;

    for (int i = 0; i < N; i++) {
        if (idade[i] < 16) {
            contador++;
        }
    }

    porcentagemMenor = contador * 100.0 / N;

    printf("PESSOAS COM MENOS DE 16 ANOS = %.1lf%%\n", porcentagemMenor);

    for (int i = 0; i < N; i++) {
        if (idade[i] < 16) {
            printf("%s\n", nome[i]);
        }
    }

    return 0;
}
