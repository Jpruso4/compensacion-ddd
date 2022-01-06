package co.com.sofka.compensacionDDD.domain.gestionEducacion.command;

import co.com.sofka.compensacionDDD.domain.generics.Institucion;
import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.EducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.Estudio;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.GestionEducacionId;
import co.com.sofka.compensacionDDD.domain.gestionEducacion.value.Tipo;
import co.com.sofka.domain.generic.Command;

public class AgregarEducacion extends Command {

    private final GestionEducacionId gestionEducacionId;
    private final EducacionId educacionId;
    private final Tipo tipo;
    private final Estudio estudio;
    private final Institucion institucion;
    private final Periodo periodo;

    public AgregarEducacion(GestionEducacionId gestionEducacionId, EducacionId educacionId, Tipo tipo, Estudio estudio, Institucion institucion, Periodo periodo) {
        this.gestionEducacionId = gestionEducacionId;
        this.educacionId = educacionId;
        this.tipo = tipo;
        this.estudio = estudio;
        this.institucion = institucion;
        this.periodo = periodo;
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
