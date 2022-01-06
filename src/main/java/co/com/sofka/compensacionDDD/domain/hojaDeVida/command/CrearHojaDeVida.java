package co.com.sofka.compensacionDDD.domain.hojaDeVida.command;

import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.domain.generic.Command;

public class CrearHojaDeVida extends Command{

    private final HojaDeVidaId hojaDeVidaId;

    public CrearHojaDeVida(HojaDeVidaId hojaDeVidaId) {
        this.hojaDeVidaId = hojaDeVidaId;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }
}
