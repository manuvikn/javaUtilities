package es.manuvikn.utiles.Colecciones.tareas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.LinkedList;

public class TareaVuelos {

    public static void main(String[] args) {

        Long ta = System.currentTimeMillis();
        LinkedList<Vuelo> sv = new LinkedList<>();
        DateFormat sdf = new SimpleDateFormat("yyyy MM dd hh mm");

        try {
            sv.add(new Vuelo("AAL93", "New York", "Santiago", sdf.parse("2021 08 29 05 39"), 62));
            sv.add(new Vuelo("LAT755", "Sao Paulo", "Santiago", sdf.parse("2021 08 31 04 45"), 47));
            sv.add(new Vuelo("SKU621", "Río de Janeiro", "Santiago", sdf.parse("2021 08 30 16 00"), 52));
            sv.add(new Vuelo("DAL147", "Atlanta", "Santiago", sdf.parse("2021 08 29 13 22"), 59));
            sv.add(new Vuelo("AVA241", "Bogota", "Santiago", sdf.parse("2021 08 31 14 05"), 25));
            sv.add(new Vuelo("AMX10", "Mexico City", "Santiago", sdf.parse("2021 08 31 05 20"), 29));
            sv.add(new Vuelo("IBE6833", "Londres", "Santiago", sdf.parse("2021 08 30 08 45"), 55));
            sv.add(new Vuelo("LAT2479", "Frankfurt", "Santiago", sdf.parse("2021 08 29 07 41"), 51));
            sv.add(new Vuelo("SKU803", "Lima", "Santiago", sdf.parse("2021 08 30 10 35"), 48));
            sv.add(new Vuelo("LAT533", "Los Ángeles", "Santiago", sdf.parse("2021 08 29 09 14"), 59));
            sv.add(new Vuelo("LAT1447", "Guayaquil", "Santiago", sdf.parse("2021 08 31 08 33"), 31));
            sv.add(new Vuelo("CMP111", "Panama City", "Santiago", sdf.parse("2021 08 31 15 15"), 29));
            sv.add(new Vuelo("LAT705", "Madrid", "Santiago", sdf.parse("2021 08 30 08 14"), 47));
            sv.add(new Vuelo("AAL957", "Miami", "Santiago", sdf.parse("2021 08 29 22 53"), 60));
            sv.add(new Vuelo("ARG5091", "Buenos Aires", "Santiago", sdf.parse("2021 08 31 09 57"), 32));
            sv.add(new Vuelo("LAT1283", "Cancún", "Santiago", sdf.parse("2021 08 31 04 00"), 35));
            sv.add(new Vuelo("LAT579", "Barcelona", "Santiago", sdf.parse("2021 08 29 07 45"), 61));
            sv.add(new Vuelo("AAL945", "Dallas-Fort Worth", "Santiago", sdf.parse("2021 08 30 07 12"), 58));
            sv.add(new Vuelo("LAT501", "París", "Santiago", sdf.parse("2021 08 29 18 29"), 49));
            sv.add(new Vuelo("LAT405", "Montevideo", "Santiago", sdf.parse("2021 08 30 15 45"), 39));
        } catch (ParseException e ) {
            System.out.println(e.getMessage());
        }

        sv.stream().sorted().forEach(System.out::println);
        System.out.println();

        Vuelo last = sv.stream().sorted(Comparator.reverseOrder()).toList().get(0);

        System.out.println(new StringBuilder("El último vuelo en llegar es ")
                .append(last.getNombre())
                .append(": ")
                .append(last.getOrigen())
                .append(", aterriza el ")
                .append(last.getFechaLlegada()));

        Vuelo menosPasajeros = sv.stream().sorted(Comparator.comparing(Vuelo::getPasajeros))
                .toList().get(0);

        System.out.println(new StringBuilder("El vuelo con menor número de pasajeros es ")
                .append(menosPasajeros.getNombre())
                .append(": ")
                .append(menosPasajeros.getOrigen())
                .append(", con ")
                .append(menosPasajeros.getPasajeros())
                .append(" pasajeros"));

        Long tb = System.currentTimeMillis() - ta;
        System.out.println("Tiempo de ejecución: " + tb);

    }

}
