package co.com.sofka.compensacionDDD.domain.perfil.command;

import co.com.sofka.compensacionDDD.domain.perfil.value.FotoDePerfil;
import co.com.sofka.compensacionDDD.domain.perfil.value.PerfilId;
import co.com.sofka.domain.generic.Command;

public class ActualizarFotoDePerfil extends Command {

    private final PerfilId perfilId;
    private final FotoDePerfil fotoDePerfil;

    public ActualizarFotoDePerfil(PerfilId perfilId, FotoDePerfil fotoDePerfil) {
        this.perfilId = perfilId;
        this.fotoDePerfil = fotoDePerfil;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }

    public FotoDePerfil getFotoDePerfil() {
        return fotoDePerfil;
    }
}
