package co.com.sofka.compensacionDDD.domain.perfil.command;

import co.com.sofka.compensacionDDD.domain.generics.NombreCompleto;
import co.com.sofka.compensacionDDD.domain.perfil.value.PerfilId;
import co.com.sofka.compensacionDDD.domain.perfil.value.ReferenciaId;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreCompletoReferencia extends Command {

    private final PerfilId perfilId;
    private final NombreCompleto nombreCompleto;
    private final ReferenciaId referenciaId;

    public ActualizarNombreCompletoReferencia(PerfilId perfilId, NombreCompleto nombreCompleto, ReferenciaId referenciaId) {
        this.perfilId = perfilId;
        this.nombreCompleto = nombreCompleto;
        this.referenciaId = referenciaId;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }
}
