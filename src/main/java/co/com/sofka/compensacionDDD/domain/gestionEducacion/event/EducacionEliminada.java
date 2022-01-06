package co.com.sofka.compensacionDDD.domain.gestionEducacion.event;

import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.domain.generic.DomainEvent;

public class EducacionEliminada extends DomainEvent {

    private final EducacionId educacionId;

    public EducacionEliminada(EducacionId educacionId) {
        super("sofkau.domain.gestionEducacion.educacionEliminada");
        this.educacionId = educacionId;
    }

    public EducacionId getEducacionId() {
        return educacionId;
    }
}
