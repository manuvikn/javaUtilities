package es.manuvikn.utiles.Colecciones;

import es.manuvikn.utiles.Colecciones.model.Persona;

import java.util.*;

public class EjemploMapA {

    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();

        persona.put("nombre", "Manuel");
        persona.put("apellido", "Victoria");
        persona.put("email", "manuel@manuel.com");
        persona.put("edad", "20");
        persona.put("nacionalidad", "España");

        Collection<String> valores = persona.keySet();

        valores.forEach(System.out::println);
        System.out.println();
        separar(30);

        persona.forEach((s, s2) -> System.out.println(s + ": " + s2));

        System.out.println();
        System.out.println(persona);
        System.out.println();

        System.out.println(persona.values().getClass().getSimpleName());
        System.out.println();
        System.out.println("Ordenando el mapa por key e imprimiendolo por consola");

        persona.keySet()
                .stream()
                .sorted((a,b) -> b.compareTo(a))
                .forEach(item -> System.out.println(item + ": " + persona.get(item)));

        separar(30);


        System.out.println();
        System.out.println("Probando instanceof e isInstance");
        Integer num = Integer.valueOf(0);
        Integer numb = Integer.valueOf(1);
        System.out.println(num.getClass().isInstance(numb));

        boolean b = persona instanceof List;
        System.out.println(b);
    }


    public static void separar(Integer puntos) {
        for (int i =0; i < puntos; i ++) System.out.print("*");
        System.out.println();
    }
}
