package co.com.sofka.compensacionDDD.domain.perfil.event;

import co.com.sofka.compensacionDDD.domain.generics.NombreCompleto;
import co.com.sofka.compensacionDDD.domain.perfil.value.InformacionDeContacto;
import co.com.sofka.compensacionDDD.domain.perfil.value.ReferenciaId;
import co.com.sofka.domain.generic.DomainEvent;

public class ReferenciaAgregada extends DomainEvent {

    private final ReferenciaId referenciaId;
    private final InformacionDeContacto informacionDeContacto;
    private final NombreCompleto nombreCompleto;

    public ReferenciaAgregada(ReferenciaId referenciaId, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto) {
        super("sofkau.domain.perfil.referenciaAgregada");
        this.referenciaId = referenciaId;
        this.informacionDeContacto = informacionDeContacto;
        this.nombreCompleto = nombreCompleto;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
