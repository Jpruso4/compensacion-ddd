package co.com.sofka.compensacionDDD.domain.colaborador.event;

import co.com.sofka.compensacionDDD.domain.generics.NombreCompleto;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreCompletoActualizado extends DomainEvent {

    private final NombreCompleto nombreCompleto;

    public NombreCompletoActualizado(NombreCompleto nombreCompleto) {
        super("sofkau.domain.colaborador.nombreCompletoActualizado");
        this.nombreCompleto = nombreCompleto;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
