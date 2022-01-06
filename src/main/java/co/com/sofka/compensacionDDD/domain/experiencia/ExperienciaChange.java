package co.com.sofka.compensacionDDD.domain.experiencia;

import co.com.sofka.compensacionDDD.domain.experiencia.event.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class ExperienciaChange extends EventChange {

    public ExperienciaChange(Experiencia experiencia) {
        apply((ExperienciaCreada event) -> {
            experiencia.hojaDeVidaId = event.getHojaDeVidaId();
            experiencia.experienciaLaboral = new HashSet<>();
        });

        apply((ExperienciaLaboralAgregada event) -> {
            experiencia.experienciaLaboral.add(
                    new ExperienciaLaboral(
                            event.getExperienciaLaboralId(),
                            event.getInstitucion(),
                            event.getPeriodo(),
                            event.getConocimientosAdquiridos()
                    )
            );
        });

        apply((ExperienciaLaboralEliminada event) -> {
            experiencia.experienciaLaboral.removeIf(experienciaLaboral -> experiencia.equals(event.getExperienciaLaboralId()));
        });

        apply((PeriodoExperienciaLaboralModificado event) -> {
            experiencia.experienciaLaboral
                    .stream()
                    .filter(experienciaLaboral -> experienciaLaboral.identity().equals(event.getExperienciaLaboralId()))
                    .forEach(experienciaLaboral -> experienciaLaboral.modificarPeriodo(event.getPeriodo()));
        });

        apply((ConocimientosAdquiridosActualizado event) -> {
            experiencia.experienciaLaboral
                    .stream()
                    .filter(experienciaLaboral -> experienciaLaboral.identity().equals(event.getExperienciaLaboralId()))
                    .forEach(experienciaLaboral -> experienciaLaboral.modificarConocimientosAdquiridos(event.getConocimientosAdquiridos()));
        });
    }
}
