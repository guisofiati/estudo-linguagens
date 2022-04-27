#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {

    int M, N, i, j;

    printf("Quantas linhas vai ter a matriz? ");
    scanf("%d", &M);
    printf("Quantas colunas vai ter a matriz? ");
    scanf("%d", &N);

    int mat[M][N];

    for (i = 0; i < M; i++) {
        for (j = 0; j < N; j++){
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d", &mat[i][j]);
        }
    }

    printf("\nMATRIZ DIGITADA:\n");

    for (i = 0; i < M; i++) {
        for (j = 0; j < N; j++) {
            printf("%d ", mat[i][j]);
        }
        printf("\n");
    }

    return 0;
}
