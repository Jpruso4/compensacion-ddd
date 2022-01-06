package co.com.sofka.compensacionDDD.domain.gestionEducacion.event;

import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.Tipo;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoEducacionModificado extends DomainEvent {

    private final EducacionId educacionId;
    private final Tipo tipo;

    public TipoEducacionModificado(EducacionId educacionId, Tipo tipo) {
        super("sofkau.domain.gestioneducacion.tipoEducacionModificado");
        this.educacionId = educacionId;
        this.tipo = tipo;
    }

    public EducacionId getEducacionId() {
        return educacionId;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
