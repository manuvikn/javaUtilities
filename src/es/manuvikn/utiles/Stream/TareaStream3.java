package es.manuvikn.utiles.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class TareaStream3 {


    public static void main(String[] args) {

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        Arrays.stream(lenguajes)
                .flatMap(Stream::of)
                .distinct()
                .forEach(System.out::println);

    }
}
