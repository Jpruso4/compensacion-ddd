package Colaborador;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.compensacionDDD.domain.colaborador.command.CrearColaborador;
import co.com.sofka.compensacionDDD.domain.colaborador.event.ColaboradorCreado;
import co.com.sofka.compensacionDDD.domain.colaborador.value.*;
import co.com.sofka.compensacionDDD.domain.perfil.value.PerfilId;
import co.com.sofka.compensacionDDD.usecase.colaborador.CrearColaboradorUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class CrearColaboradorUseCaseTest {

    @Test
    void crearColaboradorCaseTest(){

        ColaboradorId colaboradorId = ColaboradorId.of("yyyy");
        HojaDeVidaId hojaDeVidaId = HojaDeVidaId.of("zzzz");
        FechaDeNacimiento fechaDeNacimiento = new FechaDeNacimiento(LocalDate.now());
        NombreCompleto nombreCompleto = new NombreCompleto("Juan", "Gutierrez");
        Cedula cedula = new Cedula("1000758938");
        Genero genero = new Genero("masculino");
        Area area = new Area("Desarrollo");
        PerfilId perfilId = PerfilId.of("xxxx");

        var command = new CrearColaborador(colaboradorId, hojaDeVidaId, fechaDeNacimiento, nombreCompleto, cedula, genero, area, perfilId);
        var useCase = new CrearColaboradorUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        var event = (ColaboradorCreado)  events.getDomainEvents().get(0);
        Assertions.assertEquals("yyyy", event.aggregateRootId());
        Assertions.assertEquals("zzzz", event.getHojaDeVidaId().value());
        Assertions.assertEquals(LocalDate.now(), event.getFechaDeNacimiento().value());
        Assertions.assertEquals("Juan", event.getNombreCompleto().value().nombre());
        Assertions.assertEquals("Gutierrez", event.getNombreCompleto().value().apellido());
        Assertions.assertEquals("1000758938", event.getCedula().value());
        Assertions.assertEquals("masculino", event.getGenero().value());
        Assertions.assertEquals("Desarrollo", event.getArea().value());
        Assertions.assertEquals("xxxx", event.getPerfilId().value());

    }


}
