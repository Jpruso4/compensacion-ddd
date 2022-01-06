package co.com.sofka.compensacionDDD.domain.experiencia.event;

import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaLaboralId;
import co.com.sofka.domain.generic.DomainEvent;

public class ExperienciaLaboralEliminada extends DomainEvent {

    private final ExperienciaLaboralId experienciaLaboralId;

    public ExperienciaLaboralEliminada(ExperienciaLaboralId experienciaLaboralId) {
        super("sofkau.domain.experiencia.experienciaLaboralEliminada");
        this.experienciaLaboralId = experienciaLaboralId;
    }

    public ExperienciaLaboralId getExperienciaLaboralId() {
        return experienciaLaboralId;
    }
}
