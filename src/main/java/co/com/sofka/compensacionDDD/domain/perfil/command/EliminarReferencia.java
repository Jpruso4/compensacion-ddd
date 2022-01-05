package co.com.sofka.compensacionDDD.domain.perfil.command;

import co.com.sofka.compensacionDDD.domain.perfil.value.PerfilId;
import co.com.sofka.compensacionDDD.domain.perfil.value.ReferenciaId;
import co.com.sofka.domain.generic.Command;

public class EliminarReferencia extends Command {

    private final ReferenciaId referenciaId;
    private final PerfilId perfilId;

    public EliminarReferencia(ReferenciaId referenciaId, PerfilId perfilId) {
        this.referenciaId = referenciaId;
        this.perfilId = perfilId;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }
}
