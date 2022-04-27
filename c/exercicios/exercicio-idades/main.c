#include <stdio.h>
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

    char nome1[50], nome2[50];
    int idade1, idade2;
    double media;

    printf("Dados da primeira pessoa:\n");
    printf("Nome: ");
    ler_texto(nome1, 50);
    printf("Idade: ");
    scanf("%d", &idade1);

    printf("Dados da segunda pessoa:\n");
    printf("Nome: ");
    limpar_entrada();
    ler_texto(nome2, 50);
    printf("Idade: ");
    scanf("%d", &idade2);

    media = (idade1 + idade2) / 2.0;

    printf("\n**********\n\n");
    printf("A idade media de %s e %s e de %.1lf anos\n", nome1, nome2, media);

    return 0;
}
