package es.manuvikn.utiles.Colecciones;

import es.manuvikn.utiles.Colecciones.model.Persona;

import java.util.*;

public class EjemploColeccionesC {

    public static void main(String[] args) {

        LinkedList<Persona> lp = new LinkedList<>();

        lp.add(new Persona("Manuel", "Victoria"));
        lp.add(new Persona("Alvaro", "Morata"));
        lp.add(new Persona("Cristiano", "Ronaldo"));
        lp.add(new Persona("Guti", "Hernandez"));
        lp.add(new Persona("David", "Villa"));
        lp.add(new Persona("Alvaro", "Morata"));
        lp.add(new Persona("Florentino", "Pérez"));

        lp.stream().sorted(Comparator.comparing(Persona::getNombre).reversed()).forEach(System.out::println);
//        lp.stream().sorted(new Comparator<Persona>() {
//            @Override
//            public int compare(Persona o1, Persona o2) {
//                return o2.getApellido().compareTo(o1.getApellido());
//            }
//        }).forEach(System.out::println);

        System.out.println();
        System.out.println("listando elementos con iterator y while:");

        Iterator<Persona> it = lp.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        ListIterator<Persona> listIterator = lp.listIterator();
        listIterator.next();
        listIterator.previous();
        System.out.println(listIterator.hasPrevious());

        System.out.println();
        System.out.println("Modificando el nombre del último elemento");
        lp.getLast().setNombre("Federico");
        lp.forEach(System.out::println);

    }
}
