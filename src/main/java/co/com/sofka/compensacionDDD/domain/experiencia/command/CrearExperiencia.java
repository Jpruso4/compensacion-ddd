package co.com.sofka.compensacionDDD.domain.experiencia.command;

import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaId;
import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.domain.generic.Command;

public class CrearExperiencia extends Command {

    private final ExperienciaId experienciaId;
    private final HojaDeVidaId hojaDeVidaId;

    public CrearExperiencia(ExperienciaId experienciaId, HojaDeVidaId hojaDeVidaId) {
        this.experienciaId = experienciaId;
        this.hojaDeVidaId = hojaDeVidaId;
    }

    public ExperienciaId getExperienciaId() {
        return experienciaId;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }
}
