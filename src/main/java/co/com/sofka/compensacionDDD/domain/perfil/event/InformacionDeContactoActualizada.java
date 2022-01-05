package co.com.sofka.compensacionDDD.domain.perfil.event;

import co.com.sofka.compensacionDDD.domain.perfil.value.InformacionDeContacto;
import co.com.sofka.domain.generic.DomainEvent;

public class InformacionDeContactoActualizada extends DomainEvent {

    private final InformacionDeContacto informacionDeContacto;

    public InformacionDeContactoActualizada(InformacionDeContacto informacionDeContacto) {
        super("sofkau.domain.perfil.informacionDeContactoActualizada");
        this.informacionDeContacto = informacionDeContacto;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }
}
