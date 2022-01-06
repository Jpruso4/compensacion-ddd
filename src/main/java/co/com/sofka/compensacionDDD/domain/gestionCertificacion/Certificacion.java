package co.com.sofka.compensacionDDD.domain.gestionCertificacion;

import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.CertificacionId;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.*;
import co.com.sofka.domain.generic.Entity;

public class Certificacion extends Entity<CertificacionId> {

    protected Nombre nombre;
    protected Institucion institucion;
    protected Periodo periodo;

    public Certificacion(CertificacionId entityId, Nombre nombre, Institucion institucion, Periodo periodo) {
        super(entityId);
        this.nombre = nombre;
        this.institucion = institucion;
        this.periodo = periodo;
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void modificarInstitucion(Institucion institucion){
        this.institucion = institucion;
    }

    public void modificarPeriodo(Periodo periodo){
        this.periodo = periodo;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Institucion Institucion() {
        return institucion;
    }

    public Periodo Periodo() {
        return periodo;
    }
}
