package colaborador;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.compensacionDDD.domain.colaborador.command.ActualizarGenero;
import co.com.sofka.compensacionDDD.domain.colaborador.event.GeneroActualizado;
import co.com.sofka.compensacionDDD.domain.colaborador.value.ColaboradorId;
import co.com.sofka.compensacionDDD.domain.colaborador.value.Genero;
import co.com.sofka.compensacionDDD.usecase.colaborador.ActualizarGeneroUseCase;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ActualizarGeneroUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    public void actualizarGeneroColaborador(){
        Genero genero = new Genero("masculino");
        ColaboradorId colaboradorId = ColaboradorId.of("xxxx");

        var command = new ActualizarGenero(colaboradorId, genero);
        var useCase = new ActualizarGeneroUseCase();

        useCase.addRepository(repository);
        when(repository.getEventsBy("xxxx")).thenReturn(events());

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(colaboradorId.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (GeneroActualizado) events.get(0);


        Assertions.assertEquals("xxxx", event.aggregateRootId());
        Assertions.assertEquals("masculino", event.getGenero().value());
    }

    private List<DomainEvent> events() {
        return List.of(new GeneroActualizado(
                new Genero("masculino")
        ));
    }
}
