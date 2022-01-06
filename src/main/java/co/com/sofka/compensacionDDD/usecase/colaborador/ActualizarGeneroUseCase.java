package co.com.sofka.compensacionDDD.usecase.colaborador;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.compensacionDDD.domain.colaborador.Colaborador;
import co.com.sofka.compensacionDDD.domain.colaborador.command.ActualizarGenero;

public class ActualizarGeneroUseCase extends UseCase<RequestCommand<ActualizarGenero>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarGenero> requestCommand) {
        var command = requestCommand.getCommand();
        Colaborador colaborador;
        colaborador = Colaborador.from(command.getColaboradorId(), retrieveEvents());
        emit().onResponse(new ResponseEvents(colaborador.getUncommittedChanges()));
    }
}
