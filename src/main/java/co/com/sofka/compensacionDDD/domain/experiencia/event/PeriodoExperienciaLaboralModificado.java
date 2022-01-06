package co.com.sofka.compensacionDDD.domain.experiencia.event;

import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaLaboralId;
import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.domain.generic.DomainEvent;

public class PeriodoExperienciaLaboralModificado extends DomainEvent {

    private final ExperienciaLaboralId experienciaLaboralId;
    private final Periodo periodo;

    public PeriodoExperienciaLaboralModificado(ExperienciaLaboralId experienciaLaboralId, Periodo periodo) {
        super("sofkau.domain.experiencia.periodoExperienciaLaboralModificado");
        this.experienciaLaboralId = experienciaLaboralId;
        this.periodo = periodo;
    }

    public ExperienciaLaboralId getExperienciaLaboralId () {
        return experienciaLaboralId;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
