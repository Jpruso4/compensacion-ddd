package co.com.sofka.compensacionDDD.domain.colaborador.event;

import co.com.sofka.compensacionDDD.domain.colaborador.value.Area;
import co.com.sofka.domain.generic.DomainEvent;

public class AreaActualizada extends DomainEvent {

    private final Area area;

    public AreaActualizada(Area area) {
        super("sofkau.domain.colaborador.areaActualizada");
        this.area = area;
    }

    public Area getArea() {
        return area;
    }
}
