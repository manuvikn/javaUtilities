package es.manuvikn.utiles.patrones.singleton;

public class EjemploSingleton {

    public static void main(String[] args) {

        for (int i =0; i < 10; i ++ ) {
            ConexionBDSingleton con = ConexionBDSingleton.getInstancia();
            System.out.println("con = " + con);
        }

    }

}
