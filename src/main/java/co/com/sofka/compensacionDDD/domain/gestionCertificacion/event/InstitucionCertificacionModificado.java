package co.com.sofka.compensacionDDD.domain.gestionCertificacion.event;

import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.Institucion;
import co.com.sofka.domain.generic.DomainEvent;

public class InstitucionCertificacionModificado extends DomainEvent {

    private final Institucion institucion;

    public InstitucionCertificacionModificado(Institucion institucion) {
        super("sofkau.domain.gestionCertificacion.institucionCertificaionModificado");
        this.institucion = institucion;
    }

    public Institucion getInstitucion() {
        return institucion;
    }
}
