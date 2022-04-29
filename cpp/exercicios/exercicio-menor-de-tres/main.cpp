#include <iostream>

using namespace std;

int main() {

    int n1, n2, n3, menor;

    cout << "Primeiro valor: ";
    cin >> n1;
    cout << "Segundo valor: ";
    cin >> n2;
    cout << "Terceiro valor: ";
    cin >> n3;

    if (n1 <= n2 && n1 <= n3) {
        menor = n1;
    }
    else if (n2 <= n3) {
        menor = n2;
    }
    else {
        menor = n3;
    }

    cout << endl;
    cout << "MENOR = " << menor << endl;

    return 0;
}
