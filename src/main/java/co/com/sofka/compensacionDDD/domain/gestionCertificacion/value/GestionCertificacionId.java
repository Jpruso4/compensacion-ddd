package co.com.sofka.compensacionDDD.domain.gestionCertificacion.value;

import co.com.sofka.domain.generic.Identity;

public class GestionCertificacionId extends Identity {

    public GestionCertificacionId(){

    }

    public GestionCertificacionId(String id){
        super(id);
    }

    public static GestionCertificacionId of(String id){
        return new GestionCertificacionId(id);
    }
}
