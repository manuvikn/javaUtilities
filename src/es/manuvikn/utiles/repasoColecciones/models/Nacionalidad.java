package es.manuvikn.utiles.repasoColecciones.models;

public enum Nacionalidad {

    ESPAÑA("España"),
    ANDORRA("Andorra"),
    FRANCIA("Francia"),
    ITALIA("Italia"),
    INGLATERRA("Inglaterra"),
    PORTUGAL("Portugal"),
    ARGENTINA("Argentina");

    private String value;

    Nacionalidad( String value ) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
