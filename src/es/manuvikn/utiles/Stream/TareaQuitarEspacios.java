package es.manuvikn.utiles.Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TareaQuitarEspacios {

    public static void main(String[] args) {

        String f = "Esta es la frase, la frase que hay que eliminarle todo tipo de . , y espacios para dejarla de forma valida...";
        Long ta = System.currentTimeMillis();

//        String response = Arrays.stream(f.split("")).filter(item -> !("., ").contains(item)).map(String::toUpperCase).collect(Collectors.joining());
//        System.out.println(response);

        String response = f.replaceAll("[.|,| ]", "").toUpperCase();
        System.out.println(response);
        // con replaceAll tarda alrededor de un milisegundo mientras que de la primera manera tarda alrededor de 4 milisegundos.

        System.out.println(System.currentTimeMillis() - ta);

    }
}
