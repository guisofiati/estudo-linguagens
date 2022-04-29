#include <stdio.h>
#include <stdlib.h>

int main() {

    int M, N;

    printf("Qual a quantidade de linhas da matriz? ");
    scanf("%d", &M);
    printf("Qual a quantidade de colunas da matriz? ");
    scanf("%d", &N);

    double mat[M][N];
    double vet[M];

    for (int i = 0; i < M; i++) {
        printf("\nDigite os elementos da %d linha:\n", i+1);
        for (int j = 0; j < N; j++) {
            scanf("%lf", &mat[i][j]);
        }
    }

    for (int i = 0; i < M; i++) {
        vet[i] = 0.0;
        for (int j = 0; j < N; j++) {
            vet[i] = vet[i] + mat[i][j];
        }
    }

    printf("\nVETOR GERADO:\n");

    for (int i = 0; i < M; i++) {
        printf("%.1lf\n", vet[i]);
    }

    return 0;
}
