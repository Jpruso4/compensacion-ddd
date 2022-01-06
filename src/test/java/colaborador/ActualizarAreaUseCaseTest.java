package colaborador;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.compensacionDDD.domain.colaborador.command.ActualizarArea;
import co.com.sofka.compensacionDDD.domain.colaborador.event.AreaActualizada;
import co.com.sofka.compensacionDDD.domain.colaborador.value.Area;
import co.com.sofka.compensacionDDD.domain.colaborador.value.ColaboradorId;
import co.com.sofka.compensacionDDD.usecase.colaborador.ActualizarAreaUseCase;
import co.com.sofka.domain.generic.DomainEvent;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ActualizarAreaUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    public void actualizarAreaDelColaborador(){
        Area area = new Area("Ingeniero");
        ColaboradorId colaboradorId = ColaboradorId.of("xxxxx");

        var command = new ActualizarArea(colaboradorId,area);
        var useCase = new ActualizarAreaUseCase();

        useCase.addRepository(repository);
        when(repository.getEventsBy("xxxxx")).thenReturn(events());

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(colaboradorId.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (AreaActualizada) events.get(0);

        Assertions.assertEquals("xxxxx", event.aggregateRootId());
        Assertions.assertEquals("Ingeniero", event.getArea().value());

    }

    private List<DomainEvent> events() {
        return List.of(new AreaActualizada(
                new Area("Ingeniero")
        ));
    }
}
