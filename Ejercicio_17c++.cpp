#include <iostream>
#include <math.h>
using namespace std;

int main() {
    float radio;
    cout << "Ingrese el radio del circulo: ";
    cin >> radio;

    cout << "La circunferencia del circulo es: " << 2*M_PI*radio << endl;
    cout << "El area del circulo es: " << M_PI*pow(radio, 2);

}