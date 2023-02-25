import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan");
        int juan = sc.nextInt();
        float alberto = (juan/3)*2;
        float ana = (juan/3)*4;
        float mama = juan + ana + alberto;
        
        System.out.println("La edad de la madre es :" + mama);
        System.out.println("La edad de Juan es :" + juan);
        System.out.println("La edad de alberto es :" + alberto);
        System.out.println("La edad de ana es :" + ana);

        sc.close();
    }
}