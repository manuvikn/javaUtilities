package es.manuvikn.utiles.ejemploD;

public enum Continentes {

    EUROPA("Europa"),
    AMERICA("América"),
    OCEANIA("Oceanía"),
    AFRICA("África"),
    ASIA("Asia");

    private String nombre;

    Continentes(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
