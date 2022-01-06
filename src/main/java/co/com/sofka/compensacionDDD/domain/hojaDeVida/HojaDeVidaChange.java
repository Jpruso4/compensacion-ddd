package co.com.sofka.compensacionDDD.domain.hojaDeVida;

import co.com.sofka.compensacionDDD.domain.hojaDeVida.event.HojaDeVidaCreada;
import co.com.sofka.domain.generic.EventChange;

public class HojaDeVidaChange extends EventChange {

    public HojaDeVidaChange(HojaDeVida hojaDeVida) {
        apply((HojaDeVidaCreada event) ->{

        });
    }
}
