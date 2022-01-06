package co.com.sofka.compensacionDDD.domain.gestionCertificacion.command;

import co.com.sofka.compensacionDDD.domain.gestionCertificacion.GestionCertificacion;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.CertificacionId;
import co.com.sofka.domain.generic.Command;

public class ModificarCertificacion extends Command {

    private final CertificacionId certificacionId;
    private final GestionCertificacion gestionCertificacion;

    public ModificarCertificacion(CertificacionId certificacionId, GestionCertificacion gestionCertificacion) {
        this.certificacionId = certificacionId;
        this.gestionCertificacion = gestionCertificacion;
    }

    public CertificacionId getCertificacionId() {
        return certificacionId;
    }

    public GestionCertificacion getGestionCertificacion() {
        return gestionCertificacion;
    }
}
