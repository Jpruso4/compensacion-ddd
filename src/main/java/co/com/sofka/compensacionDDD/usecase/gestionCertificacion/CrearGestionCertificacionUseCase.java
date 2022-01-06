package co.com.sofka.compensacionDDD.usecase.gestionCertificacion;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.GestionCertificacion;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.command.CrearGestionCertificacion;

public class CrearGestionCertificacionUseCase extends UseCase<RequestCommand<CrearGestionCertificacion>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearGestionCertificacion> requestCommand) {
        var command = requestCommand.getCommand();
        GestionCertificacion gestionCertificacion;

        gestionCertificacion = new GestionCertificacion(command.getGestionCertificacionId(),
                command.getHojaDeVidaId(),
                command.getCertificacion()
        );
        emit().onResponse(new ResponseEvents(gestionCertificacion.getUncommittedChanges()));
    }
}
