#include <stdio.h>
#include <stdlib.h>

int main() {

    int hora;

    printf("Digite a hora atual: ");
    scanf("%d", &hora);

    if (hora >= 0 && hora < 6) {
        printf("Boa madrugada!\n");
    }
    else if (hora < 13) {
        printf("Bom dia!\n");
    }
    else if (hora < 19) {
        printf("Boa tarde!\n");
    }
    else if (hora < 24){
        printf("Boa noite!\n");
    }
    else {
        printf("Hora invalida! Digite uma hora de 0 ate 23\n");
    }

    return 0;
}
