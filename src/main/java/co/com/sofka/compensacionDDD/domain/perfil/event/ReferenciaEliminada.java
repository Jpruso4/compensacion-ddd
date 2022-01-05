package co.com.sofka.compensacionDDD.domain.perfil.event;

import co.com.sofka.compensacionDDD.domain.perfil.value.ReferenciaId;
import co.com.sofka.domain.generic.DomainEvent;

public class ReferenciaEliminada extends DomainEvent {

    private final ReferenciaId referenciaId;

    public ReferenciaEliminada(ReferenciaId referenciaId) {
        super("sofkau.domain.perfil.referenciaEliminada");
        this.referenciaId = referenciaId;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }
}
