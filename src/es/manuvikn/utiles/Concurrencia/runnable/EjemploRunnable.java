package es.manuvikn.utiles.Concurrencia.runnable;

public class EjemploRunnable {

    public static void main(String[] args ) {

        new Thread(new ViajeTarea("Isla de pascua")).start();
        new Thread(new ViajeTarea("Robinson crusoe")).start();
        new Thread(new ViajeTarea("Juan Fernandez")).start();
        new Thread(new ViajeTarea("Isla de Chiloe")).start();

    }
}
