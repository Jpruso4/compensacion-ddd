package co.com.sofka.compensacionDDD.domain.gestionCertificacion.command;

import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.CertificacionId;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.GestionCertificacionId;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.Institucion;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.Nombre;
import co.com.sofka.domain.generic.Command;

public class AgregarNuevaCertificacion extends Command {

    private final GestionCertificacionId gestionCertificacionId;
    private final CertificacionId certificacionId;
    private final Nombre nombre;
    private final Institucion institucion;
    private final Periodo periodo;

    public AgregarNuevaCertificacion(GestionCertificacionId gestionCertificacionId, CertificacionId certificacionId, Nombre nombre, Institucion institucion, Periodo periodo) {
        this.gestionCertificacionId = gestionCertificacionId;
        this.certificacionId = certificacionId;
        this.nombre = nombre;
        this.institucion = institucion;
        this.periodo = periodo;
    }

    public GestionCertificacionId getGestionCertificacionId() {
        return gestionCertificacionId;
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
