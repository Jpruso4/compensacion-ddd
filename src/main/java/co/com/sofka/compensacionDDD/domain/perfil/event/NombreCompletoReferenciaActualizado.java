package co.com.sofka.compensacionDDD.domain.perfil.event;

import co.com.sofka.compensacionDDD.domain.generics.NombreCompleto;
import co.com.sofka.compensacionDDD.domain.perfil.value.ReferenciaId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreCompletoReferenciaActualizado extends DomainEvent {

    private final ReferenciaId referenciaId;
    private final NombreCompleto nombreCompleto;

    public NombreCompletoReferenciaActualizado(ReferenciaId referenciaId, NombreCompleto nombreCompleto) {
        super("sofkau.domain.perfil.nombreCompletoReferenciaActualizado");
        this.referenciaId = referenciaId;
        this.nombreCompleto = nombreCompleto;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
