package co.com.sofka.compensacionDDD.domain.perfil.event;

import co.com.sofka.compensacionDDD.domain.perfil.value.FotoDePerfil;
import co.com.sofka.domain.generic.DomainEvent;

public class FotoDePerfilActualizada extends DomainEvent {

    private final FotoDePerfil fotoDePerfil;

    public FotoDePerfilActualizada(FotoDePerfil fotoDePerfil) {
        super("sofkau.domain.perfil.fotoDePerfilAtualizada");
        this.fotoDePerfil = fotoDePerfil;
    }

    public FotoDePerfil getFotoDePerfil() {
        return fotoDePerfil;
    }
}
