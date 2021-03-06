package co.com.sofka.compensacionDDD.usecase.perfil;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.compensacionDDD.domain.perfil.Perfil;
import co.com.sofka.compensacionDDD.domain.perfil.command.CrearPerfil;

public class CrearPerfilUseCase extends UseCase<RequestCommand<CrearPerfil>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearPerfil> requestCommand) {
        var command = requestCommand.getCommand();
        Perfil perfil;

        perfil = new Perfil(command.getPerfilId(),
                command.getHojaDeVidaId(),
                command.getInformacionDeContacto(),
                command.getFotoDePerfil()
        );
        emit().onResponse(new ResponseEvents(perfil.getUncommittedChanges()));
    }
}
