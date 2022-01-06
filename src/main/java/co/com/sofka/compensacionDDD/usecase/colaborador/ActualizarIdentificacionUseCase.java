package co.com.sofka.compensacionDDD.usecase.colaborador;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.compensacionDDD.domain.colaborador.Colaborador;
import co.com.sofka.compensacionDDD.domain.colaborador.command.ActualizarIdentificacion;

public class ActualizarIdentificacionUseCase extends UseCase<RequestCommand<ActualizarIdentificacion>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<ActualizarIdentificacion> requestCommand) {
        var command = requestCommand.getCommand();
        var colaborador = Colaborador.from(command.getColaboradorId(), retrieveEvents());

        colaborador.actualizarIdentificacion(command.getCedula());
        emit().onResponse(new ResponseEvents(colaborador.getUncommittedChanges()));
    }
}
