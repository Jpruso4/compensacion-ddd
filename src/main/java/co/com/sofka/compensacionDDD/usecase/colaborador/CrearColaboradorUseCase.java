package co.com.sofka.compensacionDDD.usecase.colaborador;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.compensacionDDD.domain.colaborador.Colaborador;
import co.com.sofka.compensacionDDD.domain.colaborador.command.CrearColaborador;

public class CrearColaboradorUseCase extends UseCase<RequestCommand<CrearColaborador>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearColaborador> requestCommand) {
        var command = requestCommand.getCommand();
        Colaborador colaborador;

        colaborador = new Colaborador(command.getColaboradorId(),
                command.getHojaDeVidaId(),
                command.getFechaDeNacimiento(),
                command.getNombreCompleto(),
                command.getCedula(),
                command.getGenero(),
                command.getArea(),
                command.getPerfilId()
        );
        emit().onResponse(new ResponseEvents(colaborador.getUncommittedChanges()));
    }
}
