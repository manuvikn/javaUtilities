package es.manuvikn.utiles;

import java.util.Iterator;

public class EjemploD {

    public static void main(String[] args) {


        int response = sum( 5,6,45345,567,56,456,45,78,7,5 );

        System.out.println(response);
        System.out.println();
        System.out.println("Números aleatorios de 20 a 100");

        for (int i = 0; i < 100; i++) {
            System.out.println(generarNumeroAleatorio());
        }

    }

    public static Integer sum( Integer len,  Integer ...numbers) {

        Integer result = Integer.valueOf(0);

        for (int i = 0; i < len; i ++) {
            result += numbers[i];
        }

        return result;
    }


    public static long generarNumeroAleatorio() {

        return (20 + Math.round(Math.random() * 80));

    }

}
