package co.com.sofka.compensacionDDD.domain.hojaDeVida.event;

import co.com.sofka.domain.generic.DomainEvent;

public class HojaDeVidaCreada extends DomainEvent {

    public HojaDeVidaCreada() {
        super("sofkau.domain.hojaDeVida.hojaDeVidaCreada");
    }
}
