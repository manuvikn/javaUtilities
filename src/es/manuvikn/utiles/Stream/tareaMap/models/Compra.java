package es.manuvikn.utiles.Stream.tareaMap.models;

import java.time.LocalDate;

public class Compra {

    private String nombre;
    private double precio;
    private LocalDate fecha;

    public Compra() {}

    public Compra(String nombre, double precio, LocalDate fecha) {
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
