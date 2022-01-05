package co.com.sofka.compensacionDDD.domain.colaborador.command;

import co.com.sofka.compensacionDDD.domain.colaborador.value.ColaboradorId;
import co.com.sofka.compensacionDDD.domain.colaborador.value.NombreCompleto;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreCompleto extends Command {

    private final ColaboradorId colaboradorId;
    private final NombreCompleto nombreCompleto;

    public ActualizarNombreCompleto(ColaboradorId colaboradorId, NombreCompleto nombreCompleto) {
        this.colaboradorId = colaboradorId;
        this.nombreCompleto = nombreCompleto;
    }

    public ColaboradorId getColaboradorId() {
        return colaboradorId;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
