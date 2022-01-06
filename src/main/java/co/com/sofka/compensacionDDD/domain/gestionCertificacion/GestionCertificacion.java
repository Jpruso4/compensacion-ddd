package co.com.sofka.compensacionDDD.domain.gestionCertificacion;

import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.event.*;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class GestionCertificacion extends AggregateEvent<GestionCertificacionId> {

    protected HojaDeVidaId hojaDeVidaId;
    protected Certificacion certificacion;

    public GestionCertificacion(GestionCertificacionId entityId, HojaDeVidaId hojaDeVidaId, Certificacion certificacion) {
        super(entityId);
        subscribe(new GestionCertificacionChange(this));
        appendChange(new GestionCertificacionCreado(hojaDeVidaId, certificacion));
    }

    public void agregarNuevaCertificacion(CertificacionId certificacionId, Nombre nombre, Institucion institucion, Periodo periodo){
        appendChange(new CertificacionAgregada(certificacionId, nombre, institucion, periodo));
    }

    public void eliminarCertificacion(CertificacionId certificacionId){
        appendChange(new CertificacionEliminada(certificacionId));
    }

    public void modificarNombreCertificacion(Nombre nombre){
        appendChange(new NombreCertificacionModificado(nombre));
    }

    public void modificarInstitucionCertificacion(Institucion institucion){
        appendChange(new InstitucionCertificacionModificado(institucion));
    }

    public void modificarPeriodoCertificacion(Periodo periodo){
        appendChange(new PeriodoCertificacionModificado(periodo));
    }

    public HojaDeVidaId HojaDeVidaId() {
        return hojaDeVidaId;
    }

    public Certificacion Certificacion() {
        return certificacion;
    }
}
