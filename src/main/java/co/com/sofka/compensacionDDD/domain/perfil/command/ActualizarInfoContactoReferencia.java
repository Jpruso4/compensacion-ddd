package co.com.sofka.compensacionDDD.domain.perfil.command;

import co.com.sofka.compensacionDDD.domain.perfil.value.InformacionDeContacto;
import co.com.sofka.compensacionDDD.domain.perfil.value.PerfilId;
import co.com.sofka.compensacionDDD.domain.perfil.value.ReferenciaId;
import co.com.sofka.domain.generic.Command;

public class ActualizarInfoContactoReferencia extends Command {

    private final PerfilId perfilId;
    private final ReferenciaId referenciaId;
    private final InformacionDeContacto informacionDeContacto;

    public ActualizarInfoContactoReferencia(PerfilId perfilId, ReferenciaId referenciaId, InformacionDeContacto informacionDeContacto) {
        this.perfilId = perfilId;
        this.referenciaId = referenciaId;
        this.informacionDeContacto = informacionDeContacto;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }
}
