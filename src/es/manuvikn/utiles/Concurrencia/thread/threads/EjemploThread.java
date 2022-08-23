package es.manuvikn.utiles.Concurrencia.thread.threads;

public class EjemploThread extends Thread{

    public EjemploThread(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {

        System.out.println("Se inicia el método run del hilo " + this.getName());

        for (int i =0; i < 10 ; i ++) {
            System.out.println(this.getName());
        }
    }
}
