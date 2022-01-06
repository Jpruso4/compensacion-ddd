package co.com.sofka.compensacionDDD.domain.gestionCertificacion.event;

import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.CertificacionId;
import co.com.sofka.domain.generic.DomainEvent;

public class CertificacionEliminada extends DomainEvent {

    private final CertificacionId certificacionId;

    public CertificacionEliminada(CertificacionId certificacionId) {
        super("sofkau.domain.gestionCertificacion.certificacionEliminada");
        this.certificacionId = certificacionId;
    }

    public CertificacionId getCertificacionId() {
        return certificacionId;
    }
}
