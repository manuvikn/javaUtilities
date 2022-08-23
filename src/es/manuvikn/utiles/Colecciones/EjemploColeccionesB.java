package es.manuvikn.utiles.Colecciones;

import es.manuvikn.utiles.Colecciones.model.Persona;

import java.util.LinkedList;
import java.util.List;

public class EjemploColeccionesB {

    public static void main(String[] args) {

        List<Persona> lp = new LinkedList<>();

        lp.add(new Persona("Manuel", "Victoria"));
        lp.add(new Persona("Guti", "Hernandez"));
        lp.add(new Persona("Cristiano", "Ronaldo"));
        lp.add(new Persona("Florentino", "Pérez"));
        lp.add(new Persona("David", "Villa"));
        lp.add(new Persona("Alvaro", "Morata"));
        lp.add(new Persona("Alvaro", "Morata"));

        System.out.println("Lista de todos los futbolistas ==========");

        lp.forEach(System.out::println);

        Persona guti = lp.stream().filter(item -> item.getNombre().equalsIgnoreCase("guti")).toList().get(0);
        System.out.println();

        lp.remove(guti);

        System.out.println("Lista de futbolistas despues de haber borrado a guti");
        lp.forEach(System.out::println);

        System.out.println();
        System.out.println("¿" + lp.get(lp.size() - 2) + " es igual que " + lp.get(lp.size() - 1) + "?: " + lp.get(lp.size() - 2).equals(lp.get(lp.size() - 1)));
        System.out.println();

        Persona morata = new Persona("Alvaro", "Morata");

        System.out.println("Filtrando los elementos de la lista que sean iguales que el elemento morata usando programación funcional");
        lp.stream().filter(item -> item.equals(morata)).forEach(System.out::println);
        System.out.println();

        System.out.println("Modificando la lista dejando solo los elementos que se encuentren en una lista donde solo existe el elemento morata");
        System.out.println(lp.retainAll(List.of(morata)));
        lp.forEach(System.out::println);
    }
}
