package es.manuvikn.utiles.optional;

import java.util.Optional;

public class EjemploOptional {

    public static void main(String[] args) {

        Optional<String> o = Optional.of("Manuel");


        o.ifPresentOrElse(System.out::println, () -> System.out.println("El optional esta vacío"));


    }

}
