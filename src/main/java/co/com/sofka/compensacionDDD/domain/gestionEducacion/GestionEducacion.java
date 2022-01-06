package co.com.sofka.compensacionDDD.domain.gestionEducacion;

import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.generics.Institucion;
import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.event.*;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.Estudio;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.GestionEducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.Tipo;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class GestionEducacion extends AggregateEvent<GestionEducacionId> {

    protected HojaDeVidaId hojaDeVidaId;
    protected Set<Educacion> educaciones;

    public GestionEducacion(GestionEducacionId entityId, HojaDeVidaId hojaDeVidaId) {
        super(entityId);
        subscribe(new GestionEducacionChange(this));
        appendChange(new GestionEducacionCreado(hojaDeVidaId)).apply();
    }

    public void agregarNuevaEducacion(EducacionId educacionId, Tipo tipo, Estudio estudio, Institucion institucion, Periodo periodo){
        appendChange(new EducacionAgregada(educacionId, tipo, estudio, institucion, periodo)).apply();
    }

    public void eliminarEducacion(EducacionId educacionId){
        appendChange(new EducacionEliminada(educacionId));
    }

    public void modificarTipoEducacion(EducacionId educacionId, Tipo tipo){
        appendChange(new TipoEducacionModificado(educacionId, tipo)).apply();
    }

    public void modificarEstudioEducacion(EducacionId educacionId, Estudio estudio){
        appendChange(new EstudioEducacionModificado(educacionId, estudio)).apply();
    }

    public void actualizarPeriodoEducacion(EducacionId educacionId, Periodo periodo){
        appendChange(new PeriodoEducacionModificado(educacionId, periodo)).apply();
    }

    public void modificarInstitucionEducacion(EducacionId educacionId, Institucion institucion){
        appendChange(new InstitucionEducacionModificado(educacionId, institucion)).apply();
    }

    public HojaDeVidaId HojaDeVidaId() {
        return hojaDeVidaId;
    }

    public Set<Educacion> Educaciones() {
        return educaciones;
    }
}
