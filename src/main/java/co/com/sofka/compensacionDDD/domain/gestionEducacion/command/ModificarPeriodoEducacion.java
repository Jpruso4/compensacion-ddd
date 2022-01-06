package co.com.sofka.compensacionDDD.domain.gestionEducacion.command;

import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.GestionEducacionId;
import co.com.sofka.domain.generic.Command;

public class ModificarPeriodoEducacion extends Command {

    private final GestionEducacionId gestionEducacionId;
    private final EducacionId educacionId;
    private final Periodo periodo;

    public ModificarPeriodoEducacion(GestionEducacionId gestionEducacionId, EducacionId educacionId, Periodo periodo) {
        this.gestionEducacionId = gestionEducacionId;
        this.educacionId = educacionId;
        this.periodo = periodo;
    }

    public GestionEducacionId getGestionEducacionId() {
        return gestionEducacionId;
    }

    public EducacionId getEducacionId() {
        return educacionId;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
