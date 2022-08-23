package es.manuvikn.utiles.patrones.factory.producto;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {

    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void preparar() {
        System.out.println("Preparando " + nombre);
        System.out.println("Seleccionando la masa " + masa);
        System.out.println("Agregando la salsa " + salsa);
        System.out.println("Agregando ingredientes: " );
        ingredientes.forEach(System.out::println);
    }

    public void empaquetar() {
        System.out.println("Preparando la pizza en una caja de empaque...");
    }

    abstract public void cocinar();
    abstract public void cortar();

    @Override
    public String toString() {
        return "Pizza: " + nombre;
    }
 }
