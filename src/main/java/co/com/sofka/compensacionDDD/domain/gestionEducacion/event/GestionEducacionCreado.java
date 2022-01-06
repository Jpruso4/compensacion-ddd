package co.com.sofka.compensacionDDD.domain.gestionEducacion.event;

import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.domain.generic.DomainEvent;

public class GestionEducacionCreado extends DomainEvent {

    private final HojaDeVidaId hojaDeVidaId;

    public GestionEducacionCreado(HojaDeVidaId hojaDeVidaId) {
        super("sofkau.domain.gestioneducacion.gestionEducacionCreado");
        this.hojaDeVidaId = hojaDeVidaId;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }
}
