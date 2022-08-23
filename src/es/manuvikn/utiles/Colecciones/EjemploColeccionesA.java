package es.manuvikn.utiles.Colecciones;

import es.manuvikn.utiles.Colecciones.model.ComparatorPersonalizado;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EjemploColeccionesA {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();

        hs.add("andorra");
        hs.add("españa");
        hs.add("portugal");
        hs.add("alemania");
        hs.add("venezuela");
        hs.add("mexico");
        hs.add("francia");

        System.out.println("set sin ordenar ==========");

        hs.forEach(System.out::println);

        System.out.println();
        System.out.println("set ordenado de forma descendente con el comparator personalizado =============");

//        hs.stream().sorted(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        }).forEach(System.out::println);

        ComparatorPersonalizado<String> comparatorPer = new ComparatorPersonalizado<>();
        hs.stream().sorted(comparatorPer).forEach(System.out::println);

        System.out.println();
        System.out.println("set ordenado de forma ascendente usando lambda expression =================");

        hs.stream().sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);

        System.out.println();
        System.out.println("creando una lista ordenada a partir de ordenar el set =====================");

        List<String> lista = hs.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());

        lista.forEach(System.out::println);

        System.out.println();

        System.out.println(lista.getClass().getName());
    }

}
