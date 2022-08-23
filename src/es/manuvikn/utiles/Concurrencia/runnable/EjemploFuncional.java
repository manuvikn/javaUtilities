package es.manuvikn.utiles.Concurrencia.runnable;

public class EjemploFuncional {

    public static void main(String[] args) throws InterruptedException {

//        System.out.println("Ejemplo con clase anonima implementando Runnnable");
//        Runnable viaje = new Runnable() {
//            @Override
//            public void run() {
//                for (int i =0; i < 10000; i ++) {
//                    System.out.println( i+1 + ": " + Thread.currentThread().getName());
//                }
//            }
//        };
//
//        new Thread(viaje, "Isla de pascua").start();
//        new Thread(viaje, "Robinson crusoe").start();
//        new Thread(viaje, "Juan Fernandez").start();
//        new Thread(viaje, "Isla de Chiloe").start();
//
//
//        System.out.println();

        System.out.println("Ejemplo con funcion lambda");
        Runnable viaje = () -> {
            for (int i =0; i < 10000; i ++) {
                System.out.println( i+1 + ": " + Thread.currentThread().getName());
            }
        };

        Thread vA = new Thread(viaje, "Isla de pascua");
        Thread vB = new Thread(viaje, "Robinson crusoe");
        Thread vC = new Thread(viaje, "Juan Fernandez");
        Thread vD = new Thread(viaje, "Isla de Chiloe");

        vA.start();
        vB.start();
        vC.start();
        vD.start();

        // El join uno los hilos al proceso principal (main)
        vA.join();
        vB.join();
        vC.join();
        vD.join();

//        Thread.sleep(1000);

        System.out.println("Comienzan todos los hilos");
        System.out.println("Nombre del hilo main: " + Thread.currentThread().getName());
    }

}
