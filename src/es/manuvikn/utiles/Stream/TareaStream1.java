package es.manuvikn.utiles.Stream;

import java.util.LinkedList;
import java.util.List;

public class TareaStream1 {

    public static void main(String[] args) {

        List<Integer> ln = new LinkedList<>();

        for(int i = 1; i < 101; i ++) {
            ln.add(i);
        }

        Double result = ln.stream()
                .filter(item -> item % 10 != 0)
                .mapToDouble(Double::valueOf)
                .map(item -> item/2)
                .reduce(0, Double::sum);

        System.out.println(result);

    }
}
