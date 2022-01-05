package co.com.sofka.compensacionDDD.domain.perfil;

import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.generics.NombreCompleto;
import co.com.sofka.compensacionDDD.domain.perfil.command.EliminarReferencia;
import co.com.sofka.compensacionDDD.domain.perfil.event.*;
import co.com.sofka.compensacionDDD.domain.perfil.value.FotoDePerfil;
import co.com.sofka.compensacionDDD.domain.perfil.value.InformacionDeContacto;
import co.com.sofka.compensacionDDD.domain.perfil.value.PerfilId;
import co.com.sofka.compensacionDDD.domain.perfil.value.ReferenciaId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Perfil extends AggregateEvent<PerfilId> {

    protected HojaDeVidaId hojaDeVidaId;
    protected InformacionDeContacto informacionDeContacto;
    protected FotoDePerfil fotoDePerfil;
    protected Refencia refencia;

    public Perfil(PerfilId entityId, HojaDeVidaId hojaDeVidaId, InformacionDeContacto informacionDeContacto, FotoDePerfil fotoDePerfil) {
        super(entityId);
        subscribe(new PerfilChange(this));
        appendChange(new PerfilCreado(hojaDeVidaId, informacionDeContacto, fotoDePerfil));

    }

    public void agregarNuevaReferencia(ReferenciaId referenciaId, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto){
        appendChange(new ReferenciaAgregada(referenciaId, informacionDeContacto, nombreCompleto));
    }

    public void eliminarReferencia(ReferenciaId referenciaId){
        appendChange(new ReferenciaEliminada(referenciaId));
    }

    public void actualizarInformacionDeContacto(InformacionDeContacto informacionDeContacto){
        appendChange(new InformacionDeContactoActualizada(informacionDeContacto));
    }

    public void actualizarFotoDePerfil(FotoDePerfil fotoDePerfil){
        appendChange(new FotoDePerfilActualizada(fotoDePerfil));
    }

    public void actualizarNombreCompletoReferencia(ReferenciaId referenciaId, NombreCompleto nombreCompleto){
        appendChange(new NombreCompletoReferenciaActualizado(referenciaId, nombreCompleto));
    }

    public void actualizarInformacionDeContactoReferencia(ReferenciaId referenciaId, InformacionDeContacto informacionDeContacto){
        appendChange(new InformacionContactoReferenciaActualizada(referenciaId, informacionDeContacto));
    }

    public HojaDeVidaId HojaDeVidaId() {
        return hojaDeVidaId;
    }

    public InformacionDeContacto InformacionDeContacto() {
        return informacionDeContacto;
    }

    public FotoDePerfil FotoDePerfil() {
        return fotoDePerfil;
    }

    public Refencia Refencia() {
        return refencia;
    }
}
