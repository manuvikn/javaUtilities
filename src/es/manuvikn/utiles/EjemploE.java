package es.manuvikn.utiles;

import java.util.Random;

public class EjemploE {

    public static void main( String[] args ) {











    }

    public static void getRandomColour() {

        Random obj = new Random();
        int rand_num = obj.nextInt(0xffffff + 1);
        // format it as hexadecimal string and print
        String colorCode = String.format("#%06x", rand_num);

        System.out.println(colorCode);

    }

}
