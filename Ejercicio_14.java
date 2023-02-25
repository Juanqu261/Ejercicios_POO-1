import java.util.Scanner;
import java.lang.Math;
public class Ejercicio_14 {
    public static void main(String[] args) {

        System.out.println("Ingrese un numero: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextFloat();
        System.out.println("Su cuadrado es: " + Math.pow(num, 2));
        System.out.println("Su cubo es: " + Math.pow(num, 3));
        sc.close(); 
    }
}
