package ejercicio4;

import java.util.Scanner;

public class eje4 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        System.out.println("Impuesto 1 → 2,45% sobre el valor total");
        System.out.println("Impuesto 2 → 15% sobre el valor total\n");
        System.out.println("Impuesto 2 → 15% sobre el valor total\n");

        int opcion = teclado.nextInt();
        int premio = 23563899;

        switch (opcion){
            case 1 :
                double desc =  premio * .0245;
                double monto = 23563899 - desc;
                System.out.println("Su resultado es: " + monto);
                break;

            case 2 :
                double desc2 = premio * .15;
                double monto2 = premio - desc2;
                System.out.println("Su resultado es: " + monto2);
                break;

            case 3:
                double desc3 = premio * 0.03;
                double monto3 = premio -desc3;
                System.out.println("Su resultado es: " + monto3);
                break;
            default:
        }
    }
}
