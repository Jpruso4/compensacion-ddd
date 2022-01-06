package co.com.sofka.compensacionDDD.domain.experiencia;

import co.com.sofka.compensacionDDD.domain.experiencia.event.*;
import co.com.sofka.compensacionDDD.domain.experiencia.value.ConocimientosAdquiridos;
import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaId;
import co.com.sofka.compensacionDDD.domain.experiencia.value.ExperienciaLaboralId;
import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.generics.Institucion;
import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Experiencia extends AggregateEvent<ExperienciaId> {

    protected HojaDeVidaId hojaDeVidaId;
    protected Set<ExperienciaLaboral> experienciaLaboral;


    public Experiencia(ExperienciaId entityId, HojaDeVidaId hojaDeVidaId) {
        super(entityId);
        subscribe(new ExperienciaChange(this));
        appendChange(new ExperienciaCreada(hojaDeVidaId));
    }

    public void agregarExperienciaLaboral(ExperienciaLaboralId experienciaLaboralId, Institucion institucion, Periodo periodo, ConocimientosAdquiridos conocimientosAdquiridos){
        appendChange(new ExperienciaLaboralAgregada(experienciaLaboralId, institucion, periodo, conocimientosAdquiridos));
    }

    public void eliminarExperienciaLaboral(ExperienciaLaboralId experienciaLaboralId){
        appendChange(new ExperienciaLaboralEliminada(experienciaLaboralId));
    }

    public void modificarExperienciaLaboralPeriodo(ExperienciaLaboralId experienciaLaboralId, Periodo periodo){
        appendChange(new PeriodoExperienciaLaboralModificado(experienciaLaboralId, periodo));
    }

    public void modificarExperienciaLaboralConocimientosAdquiridos(ExperienciaLaboralId experienciaLaboralId, ConocimientosAdquiridos conocimientosAdquiridos){
        appendChange(new ConocimientosAdquiridosActualizado(experienciaLaboralId, conocimientosAdquiridos));
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }

    public Set<ExperienciaLaboral> getExperienciaLaboral() {
        return experienciaLaboral;
    }
}
