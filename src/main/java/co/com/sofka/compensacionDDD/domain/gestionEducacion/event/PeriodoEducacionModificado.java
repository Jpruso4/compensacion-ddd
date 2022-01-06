package co.com.sofka.compensacionDDD.domain.gestionEducacion.event;

import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.domain.generic.DomainEvent;

public class PeriodoEducacionModificado extends DomainEvent {

    private final EducacionId educacionId;
    private final Periodo periodo;

    public PeriodoEducacionModificado(EducacionId educacionId, Periodo periodo) {
        super("sofkau.domain.gestionEducacion.periodoEducacionModificado");
        this.educacionId = educacionId;
        this.periodo = periodo;
    }

    public EducacionId getEducacionId() {
        return educacionId;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
