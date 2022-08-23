package es.manuvikn.utiles.ejemploD;

import java.util.Comparator;
import java.util.LinkedList;

public class EjemploD {

    public static void main(String[] args) {

        LinkedList<Pais> lp = new LinkedList<>();

        lp.add(new Pais("España", 47000000L, "Castellano", Continentes.EUROPA));
        lp.add(new Pais("Andorra", 7000000L, "Francés", Continentes.EUROPA));
        lp.add(new Pais("Italia", 40000000L, "Italiano", Continentes.EUROPA));
        lp.add(new Pais("Alemania", 67000000L, "Alemán", Continentes.EUROPA));
        lp.add(new Pais("Francia", 65000000L, "Francés", Continentes.EUROPA));
        lp.add(new Pais("México", 76000000L, "Castellano", Continentes.AMERICA));

        Long num = lp.stream()
                .sorted()
                .peek(item -> System.out.println(item.getNombre()
                        .concat(": ")
                        .concat(item.getPoblacion().toString())
                        .concat(" habitantes")))
                .mapToLong(Pais::getPoblacion)
                .reduce(0, Long::sum);

        System.out.println("La suma total de población de todos los paises es: ".concat(num.toString()));

        lp.add((int) (Math.random() * lp.size()), new Pais("China", 1000000000L, "Chino", Continentes.ASIA));

        System.out.println();
        lp.stream().peek(System.out::println)
                .sorted().forEach(item -> System.out.println(new StringBuilder(item.getNombre())
                .append(": ").append(item.getPoblacion()).append(" habitantes, ")
                .append("continente: ").append(item.getContinente())));

        lp.addLast(new Pais("Argentina", 80000000L, "Castellano", Continentes.AMERICA));
        System.out.println();

        lp.forEach(System.out::println);

    }
}
