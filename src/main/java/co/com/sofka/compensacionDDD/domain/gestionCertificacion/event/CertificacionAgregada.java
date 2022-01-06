package co.com.sofka.compensacionDDD.domain.gestionCertificacion.event;

import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.CertificacionId;
import co.com.sofka.compensacionDDD.domain.generics.Institucion;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.Nombre;
import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.domain.generic.DomainEvent;

public class CertificacionAgregada extends DomainEvent {

    private final CertificacionId certificacionId;
    private final Nombre nombre;
    private final Institucion institucion;
    private final Periodo periodo;

    public CertificacionAgregada(CertificacionId certificacionId, Nombre nombre, Institucion institucion, Periodo periodo) {
        super("sofkau.domain.gestionCertificacion.certificacionAgregada");
        this.certificacionId = certificacionId;
        this.nombre = nombre;
        this.institucion = institucion;
        this.periodo = periodo;
    }

    public CertificacionId getCertificacionId() {
        return certificacionId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
