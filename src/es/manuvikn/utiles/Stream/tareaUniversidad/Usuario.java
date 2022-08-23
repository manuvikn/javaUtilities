package es.manuvikn.utiles.Stream.tareaUniversidad;

import java.util.Optional;

public class Usuario {

    private Optional<Tarjeta> tarjetaOptional;

    public Usuario() {
        this.tarjetaOptional = Optional.empty();
    }

    public void setTarjetaOptional(Tarjeta t) {

        this.tarjetaOptional = Optional.of(t);

    }

    public void pagarServicio() {

        this.tarjetaOptional.ifPresentOrElse(this::realizarPago, () -> System.out.println("La tarjeta es null"));

    }

    public void realizarPago(Tarjeta t) {

        // LOGICA DEL PAGO
    }
}
