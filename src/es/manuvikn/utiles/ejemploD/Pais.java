package es.manuvikn.utiles.ejemploD;

public class Pais implements Comparable<Pais> {

    private String nombre;
    private Long poblacion;
    private String idioma;
    private Continentes continente;

    Pais() {
    }

    Pais(String nombre, Long poblacion, String idioma, Continentes continente) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.continente = continente;
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Long poblacion) {
        this.poblacion = poblacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Continentes getContinente() {
        return continente;
    }

    public void setContinente(Continentes continente) {
        this.continente = continente;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    @Override
    public int compareTo(Pais pais) {
        return pais.poblacion.compareTo(this.poblacion);
    }
}
