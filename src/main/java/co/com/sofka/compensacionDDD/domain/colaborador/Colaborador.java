package co.com.sofka.compensacionDDD.domain.colaborador;

import co.com.sofka.compensacionDDD.domain.colaborador.event.*;
import co.com.sofka.compensacionDDD.domain.colaborador.value.*;
import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.generics.NombreCompleto;
import co.com.sofka.compensacionDDD.domain.perfil.value.PerfilId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Colaborador extends AggregateEvent<ColaboradorId> {

    protected HojaDeVidaId hojaDeVidaId;
    protected FechaDeNacimiento fechaDeNacimiento;
    protected NombreCompleto nombreCompleto;
    protected Cedula cedula;
    protected Genero genero;
    protected Area area;
    protected PerfilId perfilId;

    public Colaborador(ColaboradorId entityId, HojaDeVidaId hojaDeVidaId, FechaDeNacimiento fechaDeNacimiento, NombreCompleto nombreCompleto, Cedula cedula, Genero genero, Area area, PerfilId perfilId) {
        super(entityId);
        subscribe(new ColaboradorChange(this));
        appendChange(new ColaboradorCreado(hojaDeVidaId, fechaDeNacimiento, nombreCompleto, cedula, genero, area, perfilId));
    }

    public Colaborador(ColaboradorId colaboradorId){
        super(colaboradorId);
        subscribe(new ColaboradorChange(this));
    }

    public static Colaborador from(ColaboradorId colaboradorId, List<DomainEvent> retrieveEvents) {
        var colaborador = new Colaborador(colaboradorId);
        retrieveEvents.forEach(colaborador::applyEvent);
        return colaborador;
    }

    public void actualizarFechaDeNacimiento(FechaDeNacimiento fechaDeNacimiento){
        appendChange(new FechaDeNacimientoActualizada(fechaDeNacimiento));
    }

    public void actualizarNombreCompleto(NombreCompleto nombreCompleto){
        appendChange(new NombreCompletoActualizado(nombreCompleto));
    }

    public void actualizarIdentificacion(Cedula cedula){
        appendChange(new IdentificacionActualizada(cedula));
    }

    public void actualizarGenero(Genero genero){
        appendChange(new GeneroActualizado(genero));
    }

    public void actualizarArea(Area area){
        appendChange(new AreaActualizada(area));
    }

    public HojaDeVidaId HojaDeVidaId() {
        return hojaDeVidaId;
    }

    public FechaDeNacimiento FechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public NombreCompleto NombreCompleto() {
        return nombreCompleto;
    }

    public Cedula Cedula() {
        return cedula;
    }

    public Genero Genero() {
        return genero;
    }

    public Area Area() {
        return area;
    }

    public PerfilId PerfilId() {
        return perfilId;
    }
}
