package co.com.sofka.compensacionDDD.domain.colaborador.event;

import co.com.sofka.compensacionDDD.domain.colaborador.value.Genero;
import co.com.sofka.domain.generic.DomainEvent;

public class GeneroActualizado extends DomainEvent {

    private final Genero genero;

    public GeneroActualizado(Genero genero) {
        super("sofkau.domain.colaborador.generoActualizado");
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }
}
