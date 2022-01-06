package perfil;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.perfil.command.CrearPerfil;
import co.com.sofka.compensacionDDD.domain.perfil.event.PerfilCreado;
import co.com.sofka.compensacionDDD.domain.perfil.value.FotoDePerfil;
import co.com.sofka.compensacionDDD.domain.perfil.value.InformacionDeContacto;
import co.com.sofka.compensacionDDD.domain.perfil.value.PerfilId;
import co.com.sofka.compensacionDDD.usecase.perfil.CrearPerfilUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrearPerfilUseCaseTest {

    @Test
    void crearPerfilCaseTest(){

        PerfilId perfilId = PerfilId.of("xxxx");
        HojaDeVidaId hojaDeVidaId = HojaDeVidaId.of("xxxxx");
        InformacionDeContacto informacionDeContacto = new InformacionDeContacto("juan@gmail.com", "12345");
        FotoDePerfil fotoDePerfil = new FotoDePerfil("xxxxxxxx");


        var command = new CrearPerfil(perfilId,hojaDeVidaId,informacionDeContacto,fotoDePerfil);
        var useCase = new CrearPerfilUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        var event = (PerfilCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("xxxx", event.aggregateRootId());
        Assertions.assertEquals("xxxxx", event.getHojaDeVidaId().value());
        Assertions.assertEquals("juan@gmail.com", event.getInformacionDeContacto().value().correo());
        Assertions.assertEquals("12345", event.getInformacionDeContacto().value().telefono());
        Assertions.assertEquals("xxxxxxxx", event.getFotoDePerfil().value());
    }
}
