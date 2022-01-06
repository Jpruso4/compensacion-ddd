package co.com.sofka.compensacionDDD.domain.gestionEducacion.event;

import co.com.sofka.compensacionDDD.domain.generics.Institucion;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.domain.generic.DomainEvent;

public class InstitucionEducacionModificado extends DomainEvent {

    private final EducacionId educacionId;
    private final Institucion institucion;

    public InstitucionEducacionModificado(EducacionId educacionId, Institucion institucion) {
        super("sofkau.domain.gestionEducacion.institucionEducacionModificado");
        this.educacionId = educacionId;
        this.institucion = institucion;
    }

    public EducacionId getEducacionId() {
        return educacionId;
    }

    public Institucion getInstitucion() {
        return institucion;
    }
}
