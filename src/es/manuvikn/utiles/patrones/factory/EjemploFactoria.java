package es.manuvikn.utiles.patrones.factory;

import es.manuvikn.utiles.patrones.factory.fabrica.*;
import es.manuvikn.utiles.patrones.factory.producto.PizzaProducto;

public class EjemploFactoria {

    public static void main(String[] args ) {

        PizzeriaZonaAbstractFactory pizzeriaNewYork = new PizzeriaNewYorkFactory();
        PizzaProducto pizza = pizzeriaNewYork.ordenarPizza("vegetariana");


    }

}
