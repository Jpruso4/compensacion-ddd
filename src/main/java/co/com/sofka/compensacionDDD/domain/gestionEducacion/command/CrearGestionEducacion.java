package co.com.sofka.compensacionDDD.domain.gestionEducacion.command;

import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.GestionEducacionId;
import co.com.sofka.domain.generic.Command;

public class CrearGestionEducacion extends Command {

    private final GestionEducacionId gestionEducacionId;
    private final HojaDeVidaId hojaDeVidaId;

    public CrearGestionEducacion(GestionEducacionId gestionEducacionId, HojaDeVidaId hojaDeVidaId) {
        this.gestionEducacionId = gestionEducacionId;
        this.hojaDeVidaId = hojaDeVidaId;
    }

    public GestionEducacionId getGestionEducacionId() {
        return gestionEducacionId;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }
}
