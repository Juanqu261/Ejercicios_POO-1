import java.util.Scanner;
public class Ejercicio_12 {
    public static void main(String[] args) {
        int pago_hora;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el pago por hor del trabajador. ");
        pago_hora = sc.nextInt();
        sc.close();

        float salario_bruto = pago_hora*48;
        double retencion = salario_bruto*0.125;
        double salario_neto = salario_bruto - retencion;

        System.out.println("El salario bruto del trabajador es :" + salario_bruto);
        System.out.println("La retencion del trabajador es :" + retencion);
        System.out.println("El salario neto del trabajador es :" + salario_neto);

    }
}
