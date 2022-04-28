#include <stdio.h>
#include <stdlib.h>

int main() {

    int n, contador;

    printf("Qual a ordem da matriz? ");
    scanf("%d", &n);

    int mat[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d", &mat[i][j]);
        }
    }

    printf("\nDIAGONAL PRINCIPAL:\n");

    for (int i = 0; i < n; i++) {
       printf("%d ", mat[i][i]);
    }

    contador = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (mat[i][j] < 0) {
                contador++;
            }
        }
    }

    printf("\nQUANTIDADE DE NEGATIVOS: %d\n", contador);

    return 0;
}
