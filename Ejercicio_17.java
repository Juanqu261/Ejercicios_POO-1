import java.util.Scanner;
import java.lang.Math;
public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el readio del circulo");
        double radio = sc.nextDouble();

        System.out.println("La circunferencia del circulo mide: " + 2*Math.PI*radio);
        System.out.println("El ares del circulo es: " + Math.PI*Math.pow(radio, 2));
        sc.close();
    }
}
