package es.manuvikn.utiles.repasoColecciones.models;

public class Futbolista extends Persona implements Comparable<Futbolista>{

    private String equipo;
    private Integer titulos;

    public Futbolista() {
        super();
    }

    public Futbolista(String nombre, String apellido, Integer edad, Nacionalidad nacionalidad, String equipo, Integer titulos) {
        super(nombre, apellido, edad, nacionalidad);
        this.equipo = equipo;
        this.titulos = titulos;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Integer getTitulos() {
        return titulos;
    }

    public void setTitulos(Integer titulos) {
        this.titulos = titulos;
    }

    @Override
    public String toString() {
        return this.getNombre().concat(" ").concat(this.getApellido())
                .concat(", juagdor del: ").concat(this.getEquipo());
    }

    @Override
    public int compareTo(Futbolista o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        return true;
    }
}
