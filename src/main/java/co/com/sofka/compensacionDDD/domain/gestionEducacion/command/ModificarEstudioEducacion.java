package co.com.sofka.compensacionDDD.domain.gestionEducacion.command;

import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.Estudio;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.GestionEducacionId;
import co.com.sofka.domain.generic.Command;

public class ModificarEstudioEducacion extends Command {

    private final GestionEducacionId gestionEducacionId;
    private final EducacionId educacionId;
    private final Estudio estudio;

    public ModificarEstudioEducacion(GestionEducacionId gestionEducacionId, EducacionId educacionId, Estudio estudio) {
        this.gestionEducacionId = gestionEducacionId;
        this.educacionId = educacionId;
        this.estudio = estudio;
    }

    public GestionEducacionId getGestionEducacionId() {
        return gestionEducacionId;
    }

    public EducacionId getEducacionId() {
        return educacionId;
    }

    public Estudio getEstudio() {
        return estudio;
    }
}
