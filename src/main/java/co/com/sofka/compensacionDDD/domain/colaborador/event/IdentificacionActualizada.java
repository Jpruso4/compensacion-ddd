package co.com.sofka.compensacionDDD.domain.colaborador.event;

import co.com.sofka.compensacionDDD.domain.colaborador.value.Cedula;
import co.com.sofka.domain.generic.DomainEvent;

public class IdentificacionActualizada extends DomainEvent {

    private final Cedula cedula;

    public IdentificacionActualizada(Cedula cedula) {
        super("sofkau.domain.colaborador.identificacionActualizada");
        this.cedula = cedula;
    }

    public Cedula getCedula() {
        return cedula;
    }
}
