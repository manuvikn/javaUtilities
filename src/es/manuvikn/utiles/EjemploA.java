package es.manuvikn.utiles;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploA {

    public static void main(String[] args) {

        String[] nombre = {"Manuel", "Victoria", "Sanmartin"};

        String[] nombreB = new String[] {"Victoria", "Sanmartin", "Manuel"};

        List<String> listaNombres = new LinkedList<>(Arrays.asList(nombre));

        listaNombres.add("Francisco José");

        listaNombres.forEach(System.out::println);

        long count = listaNombres.stream().count();

        System.out.println("count = " + count);

        System.out.println();


        listaNombres.stream().filter(e -> e.charAt(0) == 'M' | e.charAt(0) == 'S')
                .limit(1)
                .forEach(System.out::println);

        List<String> listaB = listaNombres.stream().filter(e -> e.charAt(0) == 'M' | e.charAt(0) == 'S')
                .limit(2)
                .collect(Collectors.toList());

        System.out.println();

        listaB.forEach(System.out::println);

        Character a = Character.valueOf('h');

        System.out.println(a.equals("h"));

        Persona persona = new Persona("Manuel", "Victoria") {
            @Override
            String saludar() {
                StringBuilder sb = new StringBuilder("Buenos días ");
                sb.append(this.nombre)
                        .append(" ")
                        .append(this.apellido)
                        .append("!, espero verte pronto.");
                return sb.toString();
            }
        };

        System.out.println(persona.saludar());
    }
}

abstract class Persona {

    protected String nombre;
    protected String apellido;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    abstract String saludar();

}