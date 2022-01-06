package co.com.sofka.compensacionDDD.domain.gestionCertificacion.event;

import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreCertificacionModificado extends DomainEvent {

    private final Nombre nombre;

    public NombreCertificacionModificado(Nombre nombre) {
        super("sofkau.domain.gestionCertificacion.nombreCertificacionModificado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
