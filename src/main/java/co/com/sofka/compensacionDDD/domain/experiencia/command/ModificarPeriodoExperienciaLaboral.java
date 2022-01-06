package co.com.sofka.compensacionDDD.domain.experiencia.command;

import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaId;
import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaLaboralId;
import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.domain.generic.Command;

public class ModificarPeriodoExperienciaLaboral extends Command {

    private final ExperienciaId experienciaId;
    private final ExperienciaLaboralId experienciaLaboralId;
    private final Periodo periodo;

    public ModificarPeriodoExperienciaLaboral(ExperienciaId experienciaId, ExperienciaLaboralId experienciaLaboralId, Periodo periodo) {
        this.experienciaId = experienciaId;
        this.experienciaLaboralId = experienciaLaboralId;
        this.periodo = periodo;
    }

    public ExperienciaId getExperienciaId() {
        return experienciaId;
    }

    public ExperienciaLaboralId getExperienciaLaboralId() {
        return experienciaLaboralId;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
