package co.com.sofka.compensacionDDD.domain.gestionEducacion.command;

import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.GestionEducacionId;
import co.com.sofka.domain.generic.Command;

public class EliminarEducacion extends Command {

    private final GestionEducacionId gestionEducacionId;
    private final EducacionId educacionId;

    public EliminarEducacion(GestionEducacionId gestionEducacionId, EducacionId educacionId) {
        this.gestionEducacionId = gestionEducacionId;
        this.educacionId = educacionId;
    }

    public GestionEducacionId getGestionEducacionId() {
        return gestionEducacionId;
    }

    public EducacionId getEducacionId() {
        return educacionId;
    }
}
