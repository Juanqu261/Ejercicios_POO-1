#include <iostream>
using namespace std;

int main() {
    float salario_b = 48*5000;
    double retencion = salario_b*0.125;
    float salario_n= salario_b - retencion;

    cout << "El trabajo bruto del trabajador es: " << salario_b << endl;
    cout << "La retencion del trabajador es: " << retencion << endl;
    cout << "El salario neto del trabajador es: " << salario_n;
}