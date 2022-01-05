package co.com.sofka.compensacionDDD.domain.colaborador.command;

import co.com.sofka.compensacionDDD.domain.colaborador.value.Area;
import co.com.sofka.compensacionDDD.domain.colaborador.value.ColaboradorId;
import co.com.sofka.domain.generic.Command;

public class ActualizarArea extends Command {

    private final ColaboradorId colaboradorId;
    private final Area area;

    public ActualizarArea(ColaboradorId colaboradorId, Area area) {
        this.colaboradorId = colaboradorId;
        this.area = area;
    }

    public ColaboradorId getColaboradorId() {
        return colaboradorId;
    }

    public Area getArea() {
        return area;
    }
}
