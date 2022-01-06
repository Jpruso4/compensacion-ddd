package co.com.sofka.compensacionDDD.domain.gestionEducacion;

import co.com.sofka.compensacionDDD.domain.gestionEducacion.event.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class GestionEducacionChange extends EventChange {

    public GestionEducacionChange(GestionEducacion gestionEducacion) {
        apply((GestionEducacionCreado event) -> {
            gestionEducacion.hojaDeVidaId = event.getHojaDeVidaId();
            gestionEducacion.educaciones = new HashSet<>();
        });

        apply((EducacionAgregada event) -> {
            gestionEducacion.educaciones.add(
                    new Educacion(
                            event.getEducacionId(),
                            event.getTipo(),
                            event.getEstudio(),
                            event.getInstitucion(),
                            event.getPeriodo()
                    )
            );
        });

        apply((EducacionEliminada event) -> {
            gestionEducacion.educaciones.removeIf(educacion -> educacion.identity().equals(event.getEducacionId()));
        });

        apply((TipoEducacionModificado event) -> {
            gestionEducacion.educaciones
                    .stream()
                    .filter(educacion -> educacion.identity().equals(event.getEducacionId()))
                    .forEach(educacion -> educacion.modificarTipo(event.getTipo()));
        });

        apply((EstudioEducacionModificado event) -> {
            gestionEducacion.educaciones
                    .stream()
                    .filter(educacion -> educacion.identity().equals(event.getEducacionId()))
                    .forEach(educacion -> educacion.modificarEstudio(event.getEstudio()));
        });

        apply((PeriodoEducacionModificado event) -> {
            gestionEducacion.educaciones
                    .stream()
                    .filter(educacion -> educacion.identity().equals(event.getEducacionId()))
                    .forEach(educacion -> educacion.modificarPeriodo(event.getPeriodo()));
        });

        apply((InstitucionEducacionModificado event) -> {
            gestionEducacion.educaciones
                    .stream()
                    .filter(educacion -> educacion.identity().equals(event.getEducacionId()))
                    .forEach(educacion -> educacion.modificarInstitucion(event.getInstitucion()));
        });
    }
}
