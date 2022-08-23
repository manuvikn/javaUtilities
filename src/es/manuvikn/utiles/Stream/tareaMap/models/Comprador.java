package es.manuvikn.utiles.Stream.tareaMap.models;

import java.util.ArrayList;
import java.util.List;

public class Comprador {

    private String nombre;
    private String dni;
    private List<Compra> compras;

    public Comprador() {
        this.compras = new ArrayList<>();
    }

    public Comprador(String nombre, String dni, List<Compra> compras) {

        this.nombre = nombre;
        this.dni = dni;
        this.compras = compras;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
}
