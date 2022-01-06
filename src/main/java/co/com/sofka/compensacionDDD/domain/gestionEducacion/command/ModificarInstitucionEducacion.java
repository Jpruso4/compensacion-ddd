package co.com.sofka.compensacionDDD.domain.gestionEducacion.command;

import co.com.sofka.compensacionDDD.domain.generics.Institucion;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.GestionEducacionId;
import co.com.sofka.domain.generic.Command;

public class ModificarInstitucionEducacion extends Command {

    private final GestionEducacionId gestionEducacionId;
    private final EducacionId educacionId;
    private final Institucion institucion;

    public ModificarInstitucionEducacion(GestionEducacionId gestionEducacionId, EducacionId educacionId, Institucion institucion) {
        this.gestionEducacionId = gestionEducacionId;
        this.educacionId = educacionId;
        this.institucion = institucion;
    }

    public GestionEducacionId getGestionEducacionId() {
        return gestionEducacionId;
    }

    public EducacionId getEducacionId() {
        return educacionId;
    }

    public Institucion getInstitucion() {
        return institucion;
    }
}
