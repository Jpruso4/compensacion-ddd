package co.com.sofka.compensacionDDD.domain.gestionCertificacion.event;

import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.Certificacion;
import co.com.sofka.domain.generic.DomainEvent;

public class GestionCertificacionCreado extends DomainEvent {

    private final HojaDeVidaId hojaDeVidaId;
    private final Certificacion certificacion;

    public GestionCertificacionCreado(HojaDeVidaId hojaDeVidaId, Certificacion certificacion) {
        super("sofkau.domain.gestionCertificacion.gestionCertificacionCreado");
        this.hojaDeVidaId = hojaDeVidaId;
        this.certificacion = certificacion;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }

    public Certificacion getCertificacion() {
        return certificacion;
    }
}
