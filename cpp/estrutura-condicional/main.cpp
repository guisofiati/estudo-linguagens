#include <iostream>

using namespace std;

int main() {

    int hora;

    cout << "Digite uma hora: ";
    cin >> hora;

    if (hora >= 0 && hora < 6) {
        cout << "Boa madrugada!" << endl;
    }
    else if (hora < 13) {
        cout << "Bom dia!" << endl;
    }
    else if (hora < 19) {
        cout << "Boa tarde!" << endl;
    }
    else if (hora < 24){
        cout << "Boa noite!" << endl;
    }
    else {
        cout << "Hora invalida. Digite uma hora de 0 a 23." << endl;
    }

    return 0;
}
