package co.com.sofka.compensacionDDD.domain.experiencia.command;

import co.com.sofka.compensacionDDD.domain.experiencia.value.ConocimientosAdquiridos;
import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaId;
import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaLaboralId;
import co.com.sofka.compensacionDDD.domain.generics.Institucion;
import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.domain.generic.Command;

public class AgregarExperienciaLaboral extends Command {
    private final ExperienciaId experienciaId;
    private final ExperienciaLaboralId experienciaLaboralId;
    private final Institucion institucion;
    private final Periodo periodo;
    private final ConocimientosAdquiridos conocimientosAdquiridos;

    public AgregarExperienciaLaboral(ExperienciaId experienciaId, ExperienciaLaboralId experienciaLaboralId, Institucion institucion, Periodo periodo, ConocimientosAdquiridos conocimientosAdquiridos) {
        this.experienciaId = experienciaId;
        this.experienciaLaboralId = experienciaLaboralId;
        this.institucion = institucion;
        this.periodo = periodo;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
    }

    public ExperienciaId getExperienciaId() {
        return experienciaId;
    }

    public ExperienciaLaboralId getExperienciaLaboralId() {
        return experienciaLaboralId;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public ConocimientosAdquiridos getConocimientosAdquiridos() {
        return conocimientosAdquiridos;
    }
}