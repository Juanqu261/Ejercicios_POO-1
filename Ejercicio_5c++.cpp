#include <iostream>
#include <math.h>
using namespace std;

int main() {
    double suma = 0;
    double x;
    cout << "Ingrese el primer numero a operar: ";
    cin >> x;

    suma = suma + x;
    double y;
    cout << "Ingrese el segundo numero a operar: ";
    cin >> y;

    x = x + pow(y, 2);
    suma = suma + x/y;

    cout << "El resultado de la suma es: " << suma;
}