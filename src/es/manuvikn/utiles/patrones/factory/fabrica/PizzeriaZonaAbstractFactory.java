package es.manuvikn.utiles.patrones.factory.fabrica;

import es.manuvikn.utiles.patrones.factory.producto.PizzaProducto;

abstract public class PizzeriaZonaAbstractFactory {

    public PizzaProducto ordenarPizza(String tipo) {
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("Fabricando " + pizza.getNombre());
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPizza(String tipo);

}
