#include <iostream>
#include <math.h>
using namespace std;

int main() {
    cout << "Ingrese un numero: " << endl;
    float num;
    cin >> num;
    cout << "El cuadrado del numero es: " << pow(num, 2) << endl;
    cout << "El cubo del numero es: " << pow(num, 3);
}