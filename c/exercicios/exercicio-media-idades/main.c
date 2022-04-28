#include <stdio.h>
#include <stdlib.h>

int main() {

    int idade, contador, soma;
    double media;

    printf("Digite as idades:\n");
    scanf("%d", &idade);

    contador = 0;
    soma = 0;

    while (idade >= 0) {
        contador++;
        soma = soma + idade;
        scanf("%d", &idade);
    }

    if (contador == 0) {
        printf("IMPOSSIVEL CALCULAR\n");
    }
    else {
        media = (double) soma / contador;
        printf("MEDIA = %.2lf\n", media);
    }

    return 0;
}
