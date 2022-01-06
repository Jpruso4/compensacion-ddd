package colaborador;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.compensacionDDD.domain.colaborador.command.ActualizarIdentificacion;
import co.com.sofka.compensacionDDD.domain.colaborador.event.IdentificacionActualizada;
import co.com.sofka.compensacionDDD.domain.colaborador.value.Cedula;
import co.com.sofka.compensacionDDD.domain.colaborador.value.ColaboradorId;
import co.com.sofka.compensacionDDD.usecase.colaborador.ActualizarIdentificacionUseCase;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ActualizarIdentificacionUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    public void actualizarIdentificacionColaborador(){
        Cedula cedula = new Cedula("1017256923");
        ColaboradorId colaboradorId = ColaboradorId.of("xxxx");


        var command = new ActualizarIdentificacion(colaboradorId, cedula);
        var usecase = new ActualizarIdentificacionUseCase();


        usecase.addRepository(repository);
        when(repository.getEventsBy("xxxx")).thenReturn(events());


        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(colaboradorId.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        var event = (IdentificacionActualizada) events.get(0);


        Assertions.assertEquals("xxxx", event.aggregateRootId());
        Assertions.assertEquals("1017256923", event.getCedula().value());
    }

    private List<DomainEvent> events() {
        return List.of(new IdentificacionActualizada(
                new Cedula("1017256923")
        ));
    }
}
