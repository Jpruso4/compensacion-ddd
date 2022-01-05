package co.com.sofka.compensacionDDD.domain.perfil.command;

import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.perfil.value.FotoDePerfil;
import co.com.sofka.compensacionDDD.domain.perfil.value.InformacionDeContacto;
import co.com.sofka.compensacionDDD.domain.perfil.value.PerfilId;
import co.com.sofka.domain.generic.Command;

public class CrearPerfil extends Command {

    private final PerfilId perfilId;
    private final HojaDeVidaId hojaDeVidaId;
    private final InformacionDeContacto informacionDeContacto;
    private final FotoDePerfil fotoDePerfil;

    public CrearPerfil(PerfilId perfilId, HojaDeVidaId hojaDeVidaId, InformacionDeContacto informacionDeContacto, FotoDePerfil fotoDePerfil) {
        this.perfilId = perfilId;
        this.hojaDeVidaId = hojaDeVidaId;
        this.informacionDeContacto = informacionDeContacto;
        this.fotoDePerfil = fotoDePerfil;
    }

    public PerfilId getPerfilId() {
        return perfilId;
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
