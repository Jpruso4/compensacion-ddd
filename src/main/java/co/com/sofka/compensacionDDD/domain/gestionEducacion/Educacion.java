package co.com.sofka.compensacionDDD.domain.gestionEducacion;

import co.com.sofka.compensacionDDD.domain.generics.Institucion;
import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.Estudio;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.Tipo;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Educacion extends Entity<EducacionId> {

    private Tipo tipo;
    private Estudio estudio;
    private Institucion institucion;
    private Periodo periodo;


    public Educacion(EducacionId entityId, Tipo tipo, Estudio estudio, Institucion institucion, Periodo periodo) {
        super(entityId);
        this.tipo = Objects.requireNonNull(tipo, "El tipo no puede ser null");
        this.estudio = Objects.requireNonNull(estudio, "El estudio no puede ser null");
        this.institucion = Objects.requireNonNull(institucion, "La institucion no puede ser null");
        this.periodo = Objects.requireNonNull(periodo, "El periodo no puede ser null");
    }


    public void modificarTipo(Tipo tipo) {
        this.tipo = Objects.requireNonNull(tipo, "El tipo no puede ser null");
    }

    public void modificarEstudio(Estudio estudio) {
        this.estudio = Objects.requireNonNull(estudio, "El estudio no puede ser null");
    }

    public void modificarPeriodo(Periodo periodo) {
        this.periodo = Objects.requireNonNull(periodo, "El periodo no puede ser null");
    }

    public void modificarInstitucion(Institucion institucion) {
        this.institucion = Objects.requireNonNull(institucion, "La institucion no puede ser null");
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