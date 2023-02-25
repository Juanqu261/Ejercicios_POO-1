#include <iostream>
using namespace std;

int main() {
    int juan;
    cout << "Ingrese la edad de Juan: ";
    cin >> juan;

    float alberto = (juan/3)*2;
    float ana = (juan/3)*4;
    float mama = juan + ana + alberto;

    cout << "La edad de la madre es: " << mama << endl;
    cout << "La edad de Juan es: " << juan << endl;
    cout << "La edad de alberto es: " << alberto << endl;
    cout << "La edad de ana es: " << ana;
}