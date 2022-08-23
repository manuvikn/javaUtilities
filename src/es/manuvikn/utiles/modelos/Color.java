package es.manuvikn.utiles.modelos;

public enum Color {

    BLANCO("Blanco"), NEGRO("Negro"), GRIS("Gris"), MARRON("Marrón");
    private String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }

}
