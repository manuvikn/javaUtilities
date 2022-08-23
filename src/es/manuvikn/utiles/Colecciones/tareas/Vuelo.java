package es.manuvikn.utiles.Colecciones.tareas;

import java.util.Date;

public class Vuelo implements Comparable<Vuelo> {

    private String nombre;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private Integer pasajeros;

    public Vuelo() {
    }

    public Vuelo(String nombre, String origen, String destino, Date fechaLlegada, Integer pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.pasajeros = pasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Integer getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Integer pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public int compareTo(Vuelo a) {
        return this.fechaLlegada.compareTo(a.fechaLlegada);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Vuelo: ");
        sb.append(this.nombre).append(" origen: ")
                .append(this.origen).append(" con destino: ")
                .append(this.destino).append(" y fecha de llegada: ")
                .append(this.fechaLlegada);
        return sb.toString();
    }
}
