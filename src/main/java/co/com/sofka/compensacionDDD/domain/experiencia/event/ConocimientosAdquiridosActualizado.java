package co.com.sofka.compensacionDDD.domain.experiencia.event;

import co.com.sofka.compensacionDDD.domain.experiencia.value.ConocimientosAdquiridos;
import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaLaboralId;
import co.com.sofka.domain.generic.DomainEvent;

public class ConocimientosAdquiridosActualizado extends DomainEvent {
    private final ExperienciaLaboralId experienciaLaboralId;
    private final ConocimientosAdquiridos conocimientosAdquiridos;

    public ConocimientosAdquiridosActualizado(ExperienciaLaboralId experienciaLaboralId, ConocimientosAdquiridos conocimientosAdquiridos) {
        super("sofkau.domain.experiencia.conocimientosAdquiridosActualizado");
        this.experienciaLaboralId = experienciaLaboralId;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
    }

    public ExperienciaLaboralId getExperienciaLaboralId() {
        return experienciaLaboralId;
    }

    public ConocimientosAdquiridos getConocimientosAdquiridos() {
        return conocimientosAdquiridos;
    }
}
