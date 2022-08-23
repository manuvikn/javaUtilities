package es.manuvikn.utiles.Stream.tareaMap;

import es.manuvikn.utiles.Stream.tareaMap.models.Compra;
import es.manuvikn.utiles.Stream.tareaMap.models.Comprador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TareaMapMain {

    public static void main(String[] args) {

//        LISTAS DE COMPRAS

        List<Compra> cPepe = new ArrayList<>();
        cPepe.add(new Compra("TV Samsung", 456.3, LocalDate.of(2022, 1, 13)));
        cPepe.add(new Compra("Hamburguesa", 5.12, LocalDate.of(2022, 1, 13)));
        cPepe.add(new Compra("Wii segunda mano", 45.3, LocalDate.of(2021, 12, 13)));
        cPepe.add(new Compra("Silla escritorio", 62.3, LocalDate.of(2021, 5, 13)));
        cPepe.add(new Compra("Sofa", 122.3, LocalDate.of(2021, 1, 13)));
        cPepe.add(new Compra("Mueble cocina", 2345.3, LocalDate.of(2022, 1, 5)));

        List<Compra> cJesus = new ArrayList<>();
        cJesus.add(new Compra("Hamburguesa", 5.12, LocalDate.of(2022, 1, 13)));
        cJesus.add(new Compra("Wii segunda mano", 45.3, LocalDate.of(2021, 12, 13)));
        cJesus.add(new Compra("Silla escritorio", 62.3, LocalDate.of(2021, 5, 13)));

        List<Compra> cAndres = new ArrayList<>();
        cAndres.add(new Compra("Hamburguesa", 5.12, LocalDate.of(2022, 1, 13)));
        cAndres.add(new Compra("Hamburguesa", 8.12, LocalDate.of(2021, 1, 13)));
        cAndres.add(new Compra("Hamburguesa", 9.12, LocalDate.of(2022, 1, 13)));

        List<Compra> cCarlos = new ArrayList<>();
        cCarlos.add(new Compra("TV Samsung", 456.3, LocalDate.of(2022, 1, 13)));
        cCarlos.add(new Compra("Mueble cocina", 2345.3, LocalDate.of(2022, 1, 5)));
        cCarlos.add(new Compra("Reforma baño", 5654.3, LocalDate.of(2022, 1, 5)));

        List<Compra> cMaria = new ArrayList<>();
        cMaria.add(new Compra("TV Samsung", 456.3, LocalDate.of(2022, 1, 13)));
        cMaria.add(new Compra("Sofa", 122.3, LocalDate.of(2021, 1, 13)));

//        COMPRADORES

        Comprador pepe = new Comprador("Pepe", "78974946C", cPepe);
        Comprador jesus = new Comprador("Jesus", "5486716534H", cJesus);
        Comprador andres = new Comprador("Andres", "475564137T", cAndres);
        Comprador carlos = new Comprador("Carlos", "786513651Y", cCarlos);
        Comprador maria = new Comprador("Maria", "87496861L", cMaria);

        List<Comprador> lComprador = new ArrayList<>();
        lComprador.add(pepe);
        lComprador.add(jesus);
        lComprador.add(andres);
        lComprador.add(carlos);
        lComprador.add(maria);

        double precioMax = 600;

        Map<String, Long> mComprador = lComprador.stream().filter(c -> c.getCompras().stream().anyMatch(compra -> compra.getPrecio() > precioMax))
                .collect(Collectors.toMap(Comprador::getDni,
                        comprador -> comprador.getCompras().stream().filter(compra -> LocalDate.now().getYear() == compra.getFecha().getYear() && LocalDate.now().getMonth() == compra.getFecha().getMonth()).count()));

        System.out.println(mComprador);

    }

}
