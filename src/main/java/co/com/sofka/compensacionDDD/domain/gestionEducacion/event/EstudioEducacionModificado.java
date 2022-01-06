package co.com.sofka.compensacionDDD.domain.gestionEducacion.event;

import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.Estudio;
import co.com.sofka.domain.generic.DomainEvent;

public class EstudioEducacionModificado extends DomainEvent {

    private final EducacionId educacionId;
    private final Estudio estudio;

    public EstudioEducacionModificado(EducacionId educacionId, Estudio estudio) {
        super("sofkau.domain.gestioneducacion.estudioEducacionModificado");
        this.educacionId = educacionId;
        this.estudio = estudio;
    }

    public EducacionId getEducacionId() {
        return educacionId;
    }

    public Estudio getEstudio() {
        return estudio;
    }
}
