package co.com.sofka.compensacionDDD.domain.experiencia.command;

import co.com.sofka.compensacionDDD.domain.experiencia.value.ConocimientosAdquiridos;
import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaId;
import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaLaboralId;
import co.com.sofka.domain.generic.Command;

public class ActualizarConocimientosAdquiridos extends Command {
    private final ExperienciaId experienciaId;
    private final ExperienciaLaboralId experienciaLaboralId;
    private final ConocimientosAdquiridos conocimientosAdquiridos;

    public ActualizarConocimientosAdquiridos(ExperienciaId experienciaId, ExperienciaLaboralId experienciaLaboralId, ConocimientosAdquiridos conocimientosAdquiridos) {
        this.experienciaId = experienciaId;
        this.experienciaLaboralId = experienciaLaboralId;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
    }

    public ExperienciaId getExperienciaId() {
        return experienciaId;
    }

    public ExperienciaLaboralId getExperienciaLaboralId() {
        return experienciaLaboralId;
    }

    public ConocimientosAdquiridos getConocimientosAdquiridos() {
        return conocimientosAdquiridos;
    }
}
