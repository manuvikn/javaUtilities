package es.manuvikn.utiles.Colecciones.model;

import java.util.Comparator;

public class ComparatorPersonalizado <T extends Comparable> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}
