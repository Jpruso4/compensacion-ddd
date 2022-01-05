package co.com.sofka.compensacionDDD.domain.colaborador.command;

import co.com.sofka.compensacionDDD.domain.colaborador.value.ColaboradorId;
import co.com.sofka.compensacionDDD.domain.colaborador.value.FechaDeNacimiento;
import co.com.sofka.domain.generic.Command;

public class ActualizarFechaDeNacimiento extends Command {

    private final ColaboradorId colaboradorId;
    private final FechaDeNacimiento fechaDeNacimiento;

    public ActualizarFechaDeNacimiento(ColaboradorId colaboradorId, FechaDeNacimiento fechaDeNacimiento) {
        this.colaboradorId = colaboradorId;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public ColaboradorId getColaboradorId() {
        return colaboradorId;
    }

    public FechaDeNacimiento getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
}
