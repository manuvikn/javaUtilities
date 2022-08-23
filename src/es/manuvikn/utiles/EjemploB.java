package es.manuvikn.utiles;

import es.manuvikn.utiles.modelos.Color;
import es.manuvikn.utiles.modelos.Perro;

import java.util.Arrays;
import java.util.List;

public class EjemploB {

    public static void main(String[] args) {

        Perro[] arrPerros = {
            new Perro("Toby", 7, "Pastor Alemán", Color.MARRON),
            new Perro("Arthur", 4, "Golden Retriever", Color.BLANCO),
            new Perro("Mario", 3, "Bulldog", Color.NEGRO),
            new Perro("Rex", 6, "Husky", Color.BLANCO),
        };

        Arrays.stream(Color.values()).toList().forEach(e -> System.out.println(e.name() + ": " + e));

        System.out.println();

        for (Perro p : arrPerros) {
            System.out.println(p.getNombre() + " -> " + p.getRaza());
        }

        Arrays.sort(arrPerros);
        System.out.println();

        for (Perro p : arrPerros) {
            System.out.println(p.getNombre() + " -> " + p.getRaza());
        }
    }
}
