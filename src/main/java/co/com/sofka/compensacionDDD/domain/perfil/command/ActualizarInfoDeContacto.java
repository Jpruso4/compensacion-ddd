package co.com.sofka.compensacionDDD.domain.perfil.command;

import co.com.sofka.compensacionDDD.domain.perfil.value.InformacionDeContacto;
import co.com.sofka.compensacionDDD.domain.perfil.value.PerfilId;
import co.com.sofka.domain.generic.Command;

public class ActualizarInfoDeContacto extends Command {

    private final PerfilId perfilId;
    private final InformacionDeContacto informacionDeContacto;

    public ActualizarInfoDeContacto(PerfilId perfilId, InformacionDeContacto informacionDeContacto) {
        this.perfilId = perfilId;
        this.informacionDeContacto = informacionDeContacto;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }
}
