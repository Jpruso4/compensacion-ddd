package co.com.sofka.compensacionDDD.domain.colaborador.event;

import co.com.sofka.compensacionDDD.domain.colaborador.value.FechaDeNacimiento;
import co.com.sofka.domain.generic.DomainEvent;

public class FechaDeNacimientoActualizada extends DomainEvent {

    private final FechaDeNacimiento fechaDeNacimiento;

    public FechaDeNacimientoActualizada(FechaDeNacimiento fechaDeNacimiento) {
        super("sofkau.domain.colaborador.fechaDeNacimientoActualizada");
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public FechaDeNacimiento getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
}
