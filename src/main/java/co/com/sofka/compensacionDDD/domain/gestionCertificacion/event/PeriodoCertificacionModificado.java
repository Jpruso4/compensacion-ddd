package co.com.sofka.compensacionDDD.domain.gestionCertificacion.event;

import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.domain.generic.DomainEvent;

public class PeriodoCertificacionModificado extends DomainEvent {

    private final Periodo periodo;

    public PeriodoCertificacionModificado(Periodo periodo) {
        super("sofkau.domain.gestionCertificacion.periodoCertificacionModificado");
        this.periodo = periodo;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
