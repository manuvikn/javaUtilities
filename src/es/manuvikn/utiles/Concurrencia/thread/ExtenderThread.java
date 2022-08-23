package es.manuvikn.utiles.Concurrencia.thread;

import es.manuvikn.utiles.Concurrencia.thread.threads.EjemploThread;

public class ExtenderThread {

    public static void main(String[] args) {


        Thread hilo = new EjemploThread("Manuel Victoria");
        hilo.start();

        Thread hilo2 = new EjemploThread("Pepe Ferreira");
        hilo2.start();

//        try {
//            Thread.sleep(2);
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }

        System.out.println(hilo.getState());
        System.out.println(hilo2.getState());
    }

}
