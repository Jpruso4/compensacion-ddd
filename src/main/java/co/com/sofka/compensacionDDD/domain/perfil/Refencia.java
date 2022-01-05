package co.com.sofka.compensacionDDD.domain.perfil;

import co.com.sofka.compensacionDDD.domain.generics.NombreCompleto;
import co.com.sofka.compensacionDDD.domain.perfil.value.*;
import co.com.sofka.domain.generic.Entity;

public class Refencia extends Entity<ReferenciaId> {

    protected InformacionDeContacto informacionDeContacto;
    protected NombreCompleto nombreCompleto;


    public Refencia(ReferenciaId entityId, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto) {
        super(entityId);
        this.informacionDeContacto = informacionDeContacto;
        this.nombreCompleto = nombreCompleto;
    }

    public void actualizarInformacionDeContacto(InformacionDeContacto informacionDeContacto){
        this.informacionDeContacto = informacionDeContacto;
    }

    public void actualizarNombreCompleto(NombreCompleto nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }

    public InformacionDeContacto InformacionDeContacto() {
        return informacionDeContacto;
    }

    public NombreCompleto NombreCompleto() {
        return nombreCompleto;
    }
}
