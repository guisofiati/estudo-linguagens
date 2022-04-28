#include <stdio.h>
#include <stdlib.h>

int main() {

    int n1, n2, n3, menor;

    printf("Primeiro valor: ");
    scanf("%d", &n1);
    printf("Segundo valor: ");
    scanf("%d", &n2);
    printf("Terceiro valor: ");
    scanf("%d", &n3);

    if (n1 <= n2 && n1 <= n3) {
        menor = n1;
    }
    else if (n2 <= n3) {
        menor = n2;
    }
    else {
        menor = n3;
    }

    printf("\n**********\n");
    printf("MENOR = %d\n", menor);

    return 0;
}
