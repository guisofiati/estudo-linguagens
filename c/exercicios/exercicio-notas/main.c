#include <stdio.h>
#include <stdlib.h>

int main() {

    double n1, n2, media;

    printf("Digite a primeira nota: ");
    scanf("%lf", &n1);
    printf("Digite a segunda nota: ");
    scanf("%lf", &n2);

    media = n1 + n2;

    printf("\n**********\n");

    if (media >= 60.00) {
        printf("NOTA FINAL = %.1lf\n", media);
    }
    else {
        printf("NOTA FINAL = %.1lf\n", media);
        printf("REPROVADO\n");
    }

    return 0;
}
