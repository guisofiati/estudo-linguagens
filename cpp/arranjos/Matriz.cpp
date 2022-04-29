#include <iostream>
#include <iomanip>

using namespace std;

int main () {

    int M, N;

    cout << "Quantas linhas vai ter a matriz? ";
    cin >> M;
    cout << "Quantas colunas vai ter a matriz? ";
    cin >> N;

    int mat[M][N];

    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            cout << "Elemento [" << i << "," << j << "]: ";
            cin >> mat[i][j];
        }
    }

    cout << "\n";
    cout << "MATRIZ DIGITADA:" << endl;

    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            cout << mat[i][j] << " ";
        }
        cout << "\n";
    }

    return 0;
}
