package es.manuvikn.utiles.patrones.factory.fabrica;

import es.manuvikn.utiles.patrones.factory.producto.PizzaNewYorkPepperoni;
import es.manuvikn.utiles.patrones.factory.producto.PizzaNewYorkVegetariana;
import es.manuvikn.utiles.patrones.factory.producto.PizzaProducto;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPizza(String tipo) {

        PizzaProducto producto = null;

        switch (tipo) {
            case "vegetariana" -> producto = new PizzaNewYorkVegetariana();
            case "pepperoni" -> producto = new PizzaNewYorkPepperoni();
            default -> producto = null;
        }

        return producto;
    }

}
