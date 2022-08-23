package es.manuvikn.utiles;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class EjemploC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer num = Integer.valueOf(0);

        try {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero del 1 al 10"));
        } catch (Exception e) {
            System.out.println("El valor a introducir debe ser númerico");
            System.out.println("¿Desea volver a intentar? S/n");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                System.exit(0);
            } else {
                EjemploC.main(args);
            }
        }

        System.out.println(num);
        System.exit(0);
    }
}
