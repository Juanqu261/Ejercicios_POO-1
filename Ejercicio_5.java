import java.lang.Math;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        double suma = 0 ;
        Scanner sc = new Scanner(System.in);

        double x;
        System.out.println("Ingrese el numero a operar");
        x = sc.nextDouble();
        suma = suma + x;

        double y;
        System.out.println("Ingrese el segundo numero a operar");
        y = sc.nextDouble();
        sc.close();
        x = x + Math.pow(y, 2);
        suma = suma + x/y;

        System.out.println("El resultado de la suma es: " + suma);
    }
}
