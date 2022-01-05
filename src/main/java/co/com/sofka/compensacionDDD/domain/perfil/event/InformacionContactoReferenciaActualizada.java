package co.com.sofka.compensacionDDD.domain.perfil.event;

import co.com.sofka.compensacionDDD.domain.perfil.value.InformacionDeContacto;
import co.com.sofka.compensacionDDD.domain.perfil.value.ReferenciaId;
import co.com.sofka.domain.generic.DomainEvent;

public class InformacionContactoReferenciaActualizada extends DomainEvent {

    private final ReferenciaId referenciaId;
    private final InformacionDeContacto informacionDeContacto;

    public InformacionContactoReferenciaActualizada(ReferenciaId referenciaId, InformacionDeContacto informacionDeContacto) {
        super("sofkau.domain.colaborador.informacionContactoReferenciaActualizada");
        this.referenciaId = referenciaId;
        this.informacionDeContacto = informacionDeContacto;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }
}
