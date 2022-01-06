package gestionCertificacion;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.generics.Periodo;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.Certificacion;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.command.CrearGestionCertificacion;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.event.GestionCertificacionCreado;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.CertificacionId;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.GestionCertificacionId;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.Institucion;
import co.com.sofka.compensacionDDD.domain.gestionCertificacion.value.Nombre;
import co.com.sofka.compensacionDDD.usecase.gestionCertificacion.CrearGestionCertificacionUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrearGestionCertificacionUseCaseTest {

    @Test
    void crearGestionCertificacionCaseTest(){

        GestionCertificacionId gestionCertificacionId = GestionCertificacionId.of("xxxx");
        HojaDeVidaId hojaDeVidaId = HojaDeVidaId.of("xxxxx");
        CertificacionId certificacionId = CertificacionId.of("xxxxxxxx");
        Nombre nombre = new Nombre("Pablo");
        Institucion institucion = new Institucion("Camilo C");
        Periodo periodo = new Periodo("2021");
        Certificacion certificacion = new Certificacion(certificacionId,nombre,institucion,periodo);

        var command = new CrearGestionCertificacion(gestionCertificacionId, hojaDeVidaId, certificacion);
        var useCase = new CrearGestionCertificacionUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        var event = (GestionCertificacionCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("xxxx", event.aggregateRootId());
        Assertions.assertEquals("xxxxx", event.getHojaDeVidaId().value());
        Assertions.assertEquals("Pablo", event.getCertificacion().Nombre().value());
        Assertions.assertEquals("Camilo C", event.getCertificacion().Institucion().value());
        Assertions.assertEquals("2021", event.getCertificacion().Periodo().value());
    }
}
