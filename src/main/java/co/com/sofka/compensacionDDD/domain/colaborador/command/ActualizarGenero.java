package co.com.sofka.compensacionDDD.domain.colaborador.command;

import co.com.sofka.compensacionDDD.domain.colaborador.value.ColaboradorId;
import co.com.sofka.compensacionDDD.domain.colaborador.value.Genero;
import co.com.sofka.domain.generic.Command;

public class ActualizarGenero extends Command {

    private final ColaboradorId colaboradorId;
    private final Genero genero;

    public ActualizarGenero(ColaboradorId colaboradorId, Genero genero) {
        this.colaboradorId = colaboradorId;
        this.genero = genero;
    }

    public ColaboradorId getColaboradorId() {
        return colaboradorId;
    }

    public Genero getGenero() {
        return genero;
    }
}
