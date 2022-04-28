#include <stdio.h>
#include <stdlib.h>

int main() {

    int M, N;
    double vet[10], soma;

    printf("Qual a quantidade de linhas da matriz? ");
    scanf("%d", &M);
    printf("Qual a quantidade de colunas da matriz? ");
    scanf("%d", &N);

    double mat[M][N];

    for (int i = 0; i < M; i++) {
        printf("\nDigite os elementos da %d linha:\n", i+1);
        for (int j = 0; j < N; j++) {
            scanf("%lf", &mat[i][j]);
        }
    }

    for (int i = 0; i < M; i++) {
        soma = 0.0;
        for (int j = 0; j < N; j++) {
            soma = soma + mat[i][j];
        }
        vet[i] = soma;
    }

    printf("\nVETOR GERADO:\n");

    for (int i = 0; i < M; i++) {
        printf("%.1lf\n", vet[i]);
    }

    return 0;
}
