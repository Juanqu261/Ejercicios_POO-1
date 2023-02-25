#include <iostream>
using namespace std;

int main() {
    int pago_hora;
    cout << "Ingrese el pago por horas del trabajador: ";
    cin >> pago_hora;

    float salario_b = 48*pago_hora;
    double retencion = salario_b*0.125;
    float salario_n= salario_b - retencion;

    cout << "El trabajo bruto del trabajador es: " << salario_b << endl;
    cout << "La retencion del trabajador es: " << retencion << endl;
    cout << "El salario neto del trabajador es: " << salario_n;
}