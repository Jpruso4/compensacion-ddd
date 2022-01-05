package co.com.sofka.compensacionDDD.domain.perfil;

import co.com.sofka.compensacionDDD.domain.perfil.command.ActualizarNombreCompletoReferencia;
import co.com.sofka.compensacionDDD.domain.perfil.event.*;
import co.com.sofka.compensacionDDD.domain.perfil.value.InformacionDeContacto;
import co.com.sofka.compensacionDDD.domain.perfil.value.ReferenciaId;
import co.com.sofka.domain.generic.EventChange;

import java.util.Set;

public class PerfilChange extends EventChange {

    public PerfilChange(Perfil perfil){
        apply((PerfilCreado event) ->{
            perfil.hojaDeVidaId = event.getHojaDeVidaId();
            perfil.informacionDeContacto = event.getInformacionDeContacto();
            perfil.fotoDePerfil = event.getFotoDePerfil();
        });

        apply((FotoDePerfilActualizada event) ->{
            perfil.fotoDePerfil = event.getFotoDePerfil();
        });

        apply((InformacionContactoReferenciaActualizada event) ->{
            perfil.refencia.actualizarInformacionDeContacto(event.getInformacionDeContacto());
        });

        apply((InformacionDeContactoActualizada event) ->{
            perfil.informacionDeContacto = event.getInformacionDeContacto();
        });

        apply((NombreCompletoReferenciaActualizado event) ->{
            perfil.refencia.actualizarNombreCompleto(event.getNombreCompleto());
        });

        apply((ReferenciaAgregada event) ->{
            perfil.refencia.nombreCompleto = event.getNombreCompleto();
            perfil.refencia.informacionDeContacto = event.getInformacionDeContacto();
        });

    }

}
