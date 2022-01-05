package co.com.sofka.compensacionDDD.domain.perfil.event;

import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.perfil.Refencia;
import co.com.sofka.compensacionDDD.domain.perfil.value.FotoDePerfil;
import co.com.sofka.compensacionDDD.domain.perfil.value.InformacionDeContacto;
import co.com.sofka.domain.generic.DomainEvent;

public class PerfilCreado extends DomainEvent {

    private final HojaDeVidaId hojaDeVidaId;
    private final InformacionDeContacto informacionDeContacto;
    private final FotoDePerfil fotoDePerfil;

    public PerfilCreado(HojaDeVidaId hojaDeVidaId, InformacionDeContacto informacionDeContacto, FotoDePerfil fotoDePerfil) {
        super("sofkau.domain.perfil.perfilCreado");
        this.hojaDeVidaId = hojaDeVidaId;
        this.informacionDeContacto = informacionDeContacto;
        this.fotoDePerfil = fotoDePerfil;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }

    public FotoDePerfil getFotoDePerfil() {
        return fotoDePerfil;
    }

}
