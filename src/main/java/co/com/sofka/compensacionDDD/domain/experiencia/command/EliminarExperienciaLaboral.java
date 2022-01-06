package co.com.sofka.compensacionDDD.domain.experiencia.command;

import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaId;
import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaLaboralId;
import co.com.sofka.domain.generic.Command;

public class EliminarExperienciaLaboral extends Command {

    private final ExperienciaId experienciaId;
    private final ExperienciaLaboralId experienciaLaboralId;

    public EliminarExperienciaLaboral(ExperienciaId experienciaId, ExperienciaLaboralId experienciaLaboralId) {
        this.experienciaId = experienciaId;
        this.experienciaLaboralId = experienciaLaboralId;
    }

    public ExperienciaId getExperienciaId() {
        return experienciaId;
    }

    public ExperienciaLaboralId getExperienciaLaboralId() {
        return experienciaLaboralId;
    }
}
