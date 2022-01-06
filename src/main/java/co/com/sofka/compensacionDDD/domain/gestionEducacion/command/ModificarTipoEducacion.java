package co.com.sofka.compensacionDDD.domain.gestionEducacion.command;

import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.GestionEducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.Tipo;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoEducacion extends Command {

    private final GestionEducacionId gestionEducacionId;
    private final EducacionId educacionId;
    private final Tipo tipo;

    public ModificarTipoEducacion(GestionEducacionId gestionEducacionId, EducacionId educacionId, Tipo tipo) {
        this.gestionEducacionId = gestionEducacionId;
        this.educacionId = educacionId;
        this.tipo = tipo;
    }

    public GestionEducacionId getGestionEducacionId() {
        return gestionEducacionId;
    }

    public EducacionId getEducacionId() {
        return educacionId;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
