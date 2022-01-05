package co.com.sofka.compensacionDDD.domain.colaborador;

import co.com.sofka.compensacionDDD.domain.colaborador.event.*;
import co.com.sofka.domain.generic.EventChange;

public class ColaboradorChange extends EventChange {

    public ColaboradorChange(Colaborador colaborador){
        apply((ColaboradorCreado event) ->{
            colaborador.hojaDeVidaId = event.getHojaDeVidaId();
            colaborador.fechaDeNacimiento = event.getFechaDeNacimiento();
            colaborador.nombreCompleto = event.getNombreCompleto();
            colaborador.cedula = event.getCedula();
            colaborador.genero = event.getGenero();
            colaborador.area = event.getArea();
            colaborador.perfilId = null;
        });

        apply((AreaActualizada event) -> {
            colaborador.area = event.getArea();
        });

        apply((NombreCompletoActualizado event) -> {
            colaborador.nombreCompleto = event.getNombreCompleto();
        });

        apply((GeneroActualizado event) -> {
            colaborador.genero = event.getGenero();
        });

        apply((IdentificacionActualizada event) -> {
            colaborador.cedula = event.getCedula();
        });

        apply((FechaDeNacimientoActualizada event) -> {
            colaborador.fechaDeNacimiento = event.getFechaDeNacimiento();
        });
    }
}
