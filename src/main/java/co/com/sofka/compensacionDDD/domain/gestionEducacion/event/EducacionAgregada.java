package co.com.sofka.compensacionDDD.domain.gestionEducacion.event;

import co.com.sofka.compensacionDDD.domain.generics.Institucion;
import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.Estudio;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.Tipo;
import co.com.sofka.domain.generic.DomainEvent;

public class EducacionAgregada extends DomainEvent {

    private final EducacionId educacionId;
    private final Tipo tipo;
    private final Estudio estudio;
    private final Institucion institucion;
    private final Periodo periodo;

    public EducacionAgregada(EducacionId educacionId, Tipo tipo, Estudio estudio, Institucion institucion, Periodo periodo) {
        super("sofkau.domain.gestioneducacion.educacionAgregada");
        this.educacionId = educacionId;
        this.tipo = tipo;
        this.estudio = estudio;
        this.institucion = institucion;
        this.periodo = periodo;
    }

    public EducacionId getEducacionId() {
        return educacionId;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
