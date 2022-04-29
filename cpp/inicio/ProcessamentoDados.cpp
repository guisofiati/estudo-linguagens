#include <iostream>
#include <iomanip>

using namespace std;

int main () {

    int a, b;

    a = 5;
    b = 2 * a;

    cout << a << endl;
    cout << b << endl;

    cout << endl << "***********" << endl;

    int c;
    double d;

    c = 5;
    d = 2 * c;

    cout << fixed << setprecision(1);
    cout << c << endl;
    cout << d << endl;

    cout << endl << "***********" << endl;

    double b1, b2, h, area;

    b1 = 6.0;
    b2 = 8.0;
    h = 5.0;

    area = (b1 + b2) / 2.0 * h;

    cout << fixed << setprecision(0);
    cout << area << endl;

    cout << endl << "***********" << endl;

    int e, f, resultado;

    e = 5;
    f = 2;

    resultado = e / f;

    cout << resultado << endl;

    cout << endl << "***********" << endl;

    int e2, f2;
    double resultado2;

    e2 = 5;
    f2 = 2;

    resultado2 = (double)e2 / f2;

    cout << fixed << setprecision(1);
    cout << resultado2 << endl;

    cout << endl << "***********" << endl;

    double i;
    int j;

    i = 5.0;

    // Casting opcional
    j = int(a);

    cout << j << endl;

    return 0;
}
