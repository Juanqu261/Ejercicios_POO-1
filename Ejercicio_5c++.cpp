#include <iostream>
#include <math.h>
using namespace std;

int main() {
    double suma = 0;
    double x = 20;
    suma = suma + x;
    double y = 40;
    x = x + pow(y, 2);
    suma = suma + x/y;

    cout << "El resultado de la suma es: " << suma;
}