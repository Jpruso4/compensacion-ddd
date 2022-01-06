package co.com.sofka.compensacionDDD.domain.gestionCertificacion.command;

import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.Certificacion;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.GestionCertificacionId;
import co.com.sofka.domain.generic.Command;

public class CrearGestionCertificacion extends Command {

    private final GestionCertificacionId gestionCertificacionId;
    private final HojaDeVidaId hojaDeVidaId;
    private final Certificacion certificacion;

    public CrearGestionCertificacion(GestionCertificacionId gestionCertificacionId, HojaDeVidaId hojaDeVidaId, Certificacion certificacion) {
        this.gestionCertificacionId = gestionCertificacionId;
        this.hojaDeVidaId = hojaDeVidaId;
        this.certificacion = certificacion;
    }

    public GestionCertificacionId getGestionCertificacionId() {
        return gestionCertificacionId;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }

    public Certificacion getCertificacion() {
        return certificacion;
    }
}
