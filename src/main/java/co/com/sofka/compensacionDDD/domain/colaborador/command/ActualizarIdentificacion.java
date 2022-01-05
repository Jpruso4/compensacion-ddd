package co.com.sofka.compensacionDDD.domain.colaborador.command;

import co.com.sofka.compensacionDDD.domain.colaborador.value.Cedula;
import co.com.sofka.compensacionDDD.domain.colaborador.value.ColaboradorId;
import co.com.sofka.domain.generic.Command;

public class ActualizarIdentificacion extends Command {

    private final ColaboradorId colaboradorId;
    private final Cedula cedula;

    public ActualizarIdentificacion(ColaboradorId colaboradorId, Cedula cedula) {
        this.colaboradorId = colaboradorId;
        this.cedula = cedula;
    }

    public ColaboradorId getColaboradorId() {
        return colaboradorId;
    }

    public Cedula getCedula() {
        return cedula;
    }
}
