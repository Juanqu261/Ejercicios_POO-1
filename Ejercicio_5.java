import java.lang.Math;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        double suma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero a operar");
        suma = sc.nextDouble();
        sc.close();
        
        double x = 20;
        suma = suma + x;
        double y = 40;
        x = x + Math.pow(y, 2);
        suma = suma + x/y;

        System.out.println("El resultado de la suma es: " + suma);
    }
}
