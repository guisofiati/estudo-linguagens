#include <stdio.h>
#include <stdlib.h>

int main() {

    int x, y, soma, temp;

    printf("Digite dois numeros:\n");
    scanf("%d", &x);
    scanf("%d", &y);

    if (x > y) {
        temp = y;
        y = x;
        x = temp;
    }

    soma = 0;
    for (int i = x+1; i < y; i++) {
        if (i % 2 != 0) {
            soma = soma + i;
        }
    }

    printf("\nSOMA DOS IMPARES = %d\n", soma);

    return 0;
}
