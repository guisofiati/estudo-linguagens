#include <stdio.h>

int main () {

    int x, y;

    x = 5;
    y = 2 * x;

    printf("%d\n", x);
    printf("%d\n", y);

    printf("------\n");

    int a;
    double b;

    a = 5;
    b = 2 * x;

    printf("%d\n", a);
    printf("%.1lf\n", b);

    printf("------\n");

    double b1, b2, h, area;

    b1 = 6.0;
    b2 = 8.0;
    h = 5.0;

    area = (b1 + b2) / 2.0 * h;

    printf("%lf\n", area);

    printf("------\n");

    int c, d, resultado;

    c = 5;
    d = 2;

    resultado = c / d;

    printf("%d\n", resultado);

    printf("------\n");

    int e, f;
    double resultado2;

    e = 5;
    f = 2;

    // Casting. Se ha 2 inteiros entao se espera uma divisao inteira.
    // Com o casting voce pega uma variavel e faz um casting para double
    resultado2 = (double)e / f;

    printf("%.2lf\n", resultado2);

    printf("------\n");

    double v;
    int w;

    v = 5.0;
    w = (int)v;

    printf("%d\n", w);

    return 0;
}
