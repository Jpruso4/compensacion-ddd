package co.com.sofka.compensacionDDD.domain.gestionCertificacion.command;

import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.CertificacionId;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.GestionCertificacionId;
import co.com.sofka.domain.generic.Command;

public class EliminarCertificacion extends Command {

    private final CertificacionId certificacionId;
    private final GestionCertificacionId gestionCertificacionId;

    public EliminarCertificacion(CertificacionId certificacionId, GestionCertificacionId gestionCertificacionId) {
        this.certificacionId = certificacionId;
        this.gestionCertificacionId = gestionCertificacionId;
    }

    public CertificacionId getCertificacionId() {
        return certificacionId;
    }

    public GestionCertificacionId getGestionCertificacionId() {
        return gestionCertificacionId;
    }
}
