package co.com.sofka.compensacionDDD.domain.experiencia.event;

import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.domain.generic.DomainEvent;

public class ExperienciaCreada extends DomainEvent {
    private final HojaDeVidaId hojaDeVidaId;

    public ExperienciaCreada(HojaDeVidaId hojaDeVidaId) {
        super("sofkau.domain.experiencia.experienciaCreada");
        this.hojaDeVidaId = hojaDeVidaId;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }
}
