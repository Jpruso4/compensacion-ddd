package co.com.sofka.compensacionDDD.domain.hojaDeVida;

import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.hojaDeVida.event.HojaDeVidaCreada;
import co.com.sofka.domain.generic.AggregateEvent;

public class HojaDeVida extends AggregateEvent<HojaDeVidaId> {

    public HojaDeVida(HojaDeVidaId entityId) {
        super(entityId);
        subscribe(new HojaDeVidaChange(this));
        appendChange(new HojaDeVidaCreada()).apply();
    }
}
