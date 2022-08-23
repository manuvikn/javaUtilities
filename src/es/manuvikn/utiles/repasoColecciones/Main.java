package es.manuvikn.utiles.repasoColecciones;

import es.manuvikn.utiles.repasoColecciones.models.Futbolista;
import es.manuvikn.utiles.repasoColecciones.models.Nacionalidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------- List -----------");

        List<Futbolista> lf = new ArrayList<>();

        lf.add( new Futbolista( "Cristiano", "Ronaldo", 37, Nacionalidad.PORTUGAL, "Manchester United", 20 ) );
        lf.add( new Futbolista( "Kylian", "Mbappe", 27, Nacionalidad.ARGENTINA, "Real Madrid", 12 ) );
        lf.add( new Futbolista( "Raul", "Gonzalez", 18, Nacionalidad.ESPAÑA, "Barcelona", 30 ) );
        lf.add( new Futbolista( "Fernando", "Gago", 20, Nacionalidad.ESPAÑA, "Barcelona", 2 ) );
        lf.add( new Futbolista( "Raul", "Garcia", 26, Nacionalidad.ITALIA, "Liverpool", 40 ) );
        lf.add( new Futbolista( "Diego", "Maradona", 23, Nacionalidad.INGLATERRA, "PSG", 9 ) );
        lf.add( new Futbolista( "Neymar", "Jr", 30, Nacionalidad.FRANCIA, "Real Madrid", 10 ) );
        lf.add( new Futbolista( "Pablo", "Gabi", 40, Nacionalidad.FRANCIA, "Real Madrid", 13 ) );
        lf.add( new Futbolista( "Leo", "Messi", 17, Nacionalidad.ITALIA, "PSG", 26 ) );
        lf.add( new Futbolista( "Arturo", "Vidal", 23, Nacionalidad.PORTUGAL, "Manchester United", 32 ) );

        lf.stream().sorted().forEach(System.out::println);

        System.out.println();
        System.out.println("---------- Set -----------");

        Set<Futbolista> sf = new HashSet<>();

        sf.add( new Futbolista( "Cristiano", "Ronaldo", 37, Nacionalidad.PORTUGAL, "Manchester United", 20 ) );
        sf.add( new Futbolista( "Kylian", "Mbappe", 27, Nacionalidad.ARGENTINA, "Real Madrid", 12 ) );
        sf.add( new Futbolista( "Raul", "Gonzalez", 18, Nacionalidad.ESPAÑA, "Barcelona", 30 ) );
        sf.add( new Futbolista( "Fernando", "Gago", 20, Nacionalidad.ESPAÑA, "Barcelona", 2 ) );
        sf.add( new Futbolista( "Raul", "Garcia", 26, Nacionalidad.ITALIA, "Liverpool", 40 ) );
        sf.add( new Futbolista( "Diego", "Maradona", 23, Nacionalidad.INGLATERRA, "PSG", 9 ) );
        sf.add( new Futbolista( "Neymar", "Jr", 30, Nacionalidad.FRANCIA, "Real Madrid", 10 ) );
        sf.add( new Futbolista( "Pablo", "Gabi", 40, Nacionalidad.FRANCIA, "Real Madrid", 13 ) );
        sf.add( new Futbolista( "Leo", "Messi", 17, Nacionalidad.ITALIA, "PSG", 26 ) );
        sf.add( new Futbolista( "Arturo", "Vidal", 23, Nacionalidad.PORTUGAL, "Manchester United", 32 ) );

        sf.stream().sorted().forEach(System.out::println);


    }

}
