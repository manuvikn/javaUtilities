package es.manuvikn.utiles.Concurrencia;

import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class EjemploContador {
    private static Scanner sc = new Scanner(System.in);
    private static Toolkit toolkit = Toolkit.getDefaultToolkit();

    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            int contador = 1;

            while(true) {
                System.out.println(contador++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
           }
        });

        t.start();

        System.out.println("Bienvenido a nuestra aplicación con contador incorporado.\nComo te llamas?");
        String n = sc.nextLine();
        System.out.println("Bienvenido " + n + "!, Qué deseas hacer?");
        printMenu();

    }

    public static void printMenu() {
        System.out.println("a) Comprar pan");
        System.out.println("b) Saludar a alguien");
        System.out.println("c) Contar hasta cien");
        System.out.println("d) Salir");

        String o = null;

        try {
            o = sc.nextLine();
        } catch (Exception e) {
            manageError();
        }

        doAction(o);

    }

    public static void doAction(String o) {

        switch (o) {

            case "a" -> {
                System.out.println("Genial, has comprado pan");
                printMenu();
            }
            case "b" -> {
                System.out.println("Has saludado a alguien");
                printMenu();
            }
            case "c" -> {
                for (int i =0; i < 100; i ++) {
                    System.out.println("Contando: número " + (i +1));
                }
                printMenu();
            }
            case "d" -> System.exit(0);
            default -> manageError();


        }


    }

    public static void manageError() {
        toolkit.beep();
        System.out.println("Por favor seleccione una opcción válida");
        System.out.println();
        printMenu();
    }
}
