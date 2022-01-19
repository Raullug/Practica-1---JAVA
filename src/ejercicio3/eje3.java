package ejercicio3;
import java.util.Scanner;

public class eje3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("--CAMPAÑA--");
        System.out.println("Ingrese los días transcurridos: ");
        int días = teclado.nextInt();

        int multi = días * 2;

        System.out.println("Los días transcurridos son: " + multi);
    }
}
