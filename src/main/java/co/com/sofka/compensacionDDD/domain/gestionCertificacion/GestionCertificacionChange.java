package co.com.sofka.compensacionDDD.domain.gestionCertificacion;

import co.com.sofka.compensacionDDD.domain.gestionCertificacion.event.*;
import co.com.sofka.domain.generic.EventChange;

public class GestionCertificacionChange extends EventChange {

    public GestionCertificacionChange(GestionCertificacion gestionCertificacion) {
        apply((GestionCertificacionCreado event) ->{
            gestionCertificacion.hojaDeVidaId = event.getHojaDeVidaId();
            gestionCertificacion.certificacion = event.getCertificacion();
        });

        apply((CertificacionAgregada event) ->{
            gestionCertificacion.certificacion.nombre = event.getNombre();
            gestionCertificacion.certificacion.institucion = event.getInstitucion();
            gestionCertificacion.certificacion.periodo = event.getPeriodo();
        });

        apply((InstitucionCertificacionModificado event) ->{
            gestionCertificacion.certificacion.institucion = event.getInstitucion();
        });

        apply((NombreCertificacionModificado event) ->{
            gestionCertificacion.certificacion.nombre = event.getNombre();
        });

        apply((PeriodoCertificacionModificado event) ->{
            gestionCertificacion.certificacion.periodo = event.getPeriodo();
        });
    }
}
