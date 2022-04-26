#include <stdio.h>
#include <string.h>

void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

void ler_texto(char *buffer, int length) {
    fgets(buffer, length, stdin);
    strtok(buffer, "\n");
}

int main() {

    int idade1, idade2, idade3;
    char nome1[50], nome2[50], nome3[50];

    /*

    - fgets serve para poder ler uma string com quebras de linha e espacos

    - fgets passa 3 argumentos: variavel, tamanho e a entrada padrao

    - quando colocamos o fgets, o valor que ele pegou foi a quebra de linha,
    entao imprimiu um valor vazio, para isso precisamos adicionar a funcao de
    limpar a entrada antes de ler o fgets

    - quando da o fgets ele le o numero de caracteres definido e tambem a quebra
    de linhas, para nao guardar isso, podemos colocar o strtok passando o nome da
    variavel e o \n. Para melhorar, pode-se utilizar a funcao

    */

    printf("Digite o valor da idade 1: ");
    scanf("%d", &idade1);
    printf("Digite o nome da pessoa 1: ");
    limpar_entrada();
    fgets(nome1, 50, stdin);
    strtok(nome1, "\n");

    printf("Digite o valor da idade 2: ");
    scanf("%d", &idade2);
    printf("Digite o nome da pessoa 2: ");
    limpar_entrada();
    fgets(nome2, 50, stdin);
    strtok(nome2, "\n");

    printf("Digite o valor da idade 3: ");
    scanf("%d", &idade3);
    printf("Digite o nome da pessoa 3: ");
    limpar_entrada();
    ler_texto(nome3, 50);

    printf("******\n");
    printf("IDADE DA PESSOA 1: %d\n", idade1);
    printf("NOME DA PESSOA 1: %s\n", nome1);
    printf("IDADE DA PESSOA 2: %d\n", idade2);
    printf("NOME DA PESSOA 2: %s\n", nome2);
    printf("IDADE DA PESSOA 3: %d\n", idade3);
    printf("NOME DA PESSOA 3: %s\n", nome3);

    return 0;
}
